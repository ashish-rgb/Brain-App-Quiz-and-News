package com.Ashish.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import io.requestly.rqinterceptor.api.RQCollector
import io.requestly.rqinterceptor.api.RQInterceptor
import okhttp3.OkHttpClient
import android.content.Context

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val collector = RQCollector(context=this, sdkKey="jOALcAml5elYYfTzWLa2")
        val rqInterceptor = RQInterceptor.Builder(this).collector(collector).build()
        val client = OkHttpClient.Builder().addInterceptor(rqInterceptor).build()





        val startButton: Button = findViewById(R.id.startButton)
        val etName: EditText = findViewById(R.id.et_name)
        startButton.setOnClickListener {

            if (etName.text.isEmpty()) {
                Toast.makeText(this,"Please Enter Your Name :)",Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this,homeScreen::class.java)
                intent.putExtra(Constants.USER_NAME,etName.text.toString())
                startActivity(intent)
                finish()
            }


        }
    }



}