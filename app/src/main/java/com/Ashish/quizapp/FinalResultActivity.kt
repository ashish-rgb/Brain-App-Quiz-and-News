package com.Ashish.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class FinalResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_result)

        val tvName : TextView = findViewById(R.id.tv_name)
        val tvScore : TextView= findViewById(R.id.tv_score)
        val btnFinish : Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        tvScore.text = "Your Score is ${intent.getIntExtra(Constants.CORRECT_ANSWERS,0)} / ${intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)}"

        btnFinish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}