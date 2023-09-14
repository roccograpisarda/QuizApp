package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private var userName : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)



        val tvName : TextView = findViewById(R.id.tvPlayerName)
        val tvResultResume : TextView = findViewById(R.id.tvResultResume)
        val btnFinish : TextView = findViewById(R.id.btnFinish)
        userName = intent.getStringExtra(Constants.USER_NAME)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        val totalAnswers = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)

        tvName.text = userName
        tvResultResume.text = "Your Score is $correctAnswers out of $totalAnswers"

        btnFinish.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}