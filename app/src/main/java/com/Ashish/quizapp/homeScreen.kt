package com.Ashish.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class homeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        var mUserName = intent.getStringExtra(Constants.USER_NAME)
        val quizbtn: Button = findViewById(R.id.startQuiz)
        val newsbtn: Button = findViewById(R.id.news)


        quizbtn.setOnClickListener {
            val intent = Intent(this,QuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME,mUserName)
            startActivity(intent)
            finish()
        }

        newsbtn.setOnClickListener {
        val intent = Intent(this,NewsActivity::class.java)
            startActivity(intent)
        }



    }
}