package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart:Button = findViewById(R.id.btnStart)
        val etName:EditText = findViewById(R.id.etName)

        btnStart.setOnClickListener {
            if(etName.text.isNotEmpty()){
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
            else{
                Toast.makeText(this, "insert a name", Toast.LENGTH_SHORT).show()

            }
        }
    }
}