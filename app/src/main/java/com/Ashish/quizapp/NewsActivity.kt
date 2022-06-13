package com.Ashish.quizapp

import android.app.DownloadManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import androidx.browser.customtabs.CustomTabsIntent
import com.android.volley.AuthFailureError
import com.android.volley.toolbox.Volley


class NewsActivity : AppCompatActivity(), NewsItemClicked {

    private lateinit var mAdapter : NewsListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        var recyclerView:RecyclerView = findViewById(R.id.newsRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        fetchData()
        mAdapter = NewsListAdapter(this)
        recyclerView.adapter = mAdapter
    }

    private fun fetchData() {
        val queue = Volley.newRequestQueue(this)
        val url = "https://newsapi.org/v2/top-headlines?country=in&apiKey=85d0e45a091a49c9828275bfd1b7bb38"

        val jsonObjectRequest = object : JsonObjectRequest(
            Request.Method.GET, url,null,
            {
              val newsJsonArray = it.getJSONArray("articles")
              val newsArray = ArrayList<News>()
              for (i in 0 until newsJsonArray.length()){
                  val newsJsonObject = newsJsonArray.getJSONObject(i)
                  val news = News(
                      newsJsonObject.getString("title"),
                      newsJsonObject.getString("author"),
                      newsJsonObject.getString("url"),
                      newsJsonObject.getString("urlToImage"),
                  )
                  newsArray.add(news)
              }
                mAdapter.updateNews(newsArray)
            },
            {

            }

        )
        {
            override fun getHeaders(): Map<String, String> {
                val params: MutableMap<String, String> = HashMap()
                params["User-Agent"] = "Mozilla/5.0"
                return params
            }
        }

        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest)


    }





    override fun onItemClicked(item: News) {
//        val url = "https://google.com/"
        val builder = CustomTabsIntent.Builder()
        val customTabsIntent = builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(item.url))
    }


}
