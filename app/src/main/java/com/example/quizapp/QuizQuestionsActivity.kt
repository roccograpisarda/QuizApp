package com.example.quizapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {


    private var progressBar : ProgressBar ?= null
    private var tvProgress : TextView? = null
    private var tvQuestion : TextView? = null
    private var ivImage : ImageView? = null

    private var tvOptionOne : TextView? = null
    private var tvOptionTwo : TextView? = null
    private var tvOptionTree: TextView? = null
    private var tvOptionFour : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tvProgress)
        tvQuestion = findViewById(R.id.tvQuestion)
        ivImage = findViewById(R.id.imgFlag)


        tvOptionOne = findViewById(R.id.tvOptionOne)
        tvOptionTwo = findViewById(R.id.tvOptionTwo)
        tvOptionTree = findViewById(R.id.tvOptionTree)
        tvOptionFour = findViewById(R.id.tvOptionFour)


        val questionList  = Constants.getQuestions()

        Log.i("question list size is" ,"${questionList.size}")


        for(i in questionList){
            Log.e("Questions", i.question)

        }
        var currentPosition = 1
        val question:Question = questionList[currentPosition-1]
        ivImage?.setImageResource(question.image)
        progressBar?.progress = currentPosition
        tvProgress?.text = "$currentPosition/${progressBar?.max}"
        tvQuestion?.text = question.question

        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionTree?.text = question.optionTree
        tvOptionFour?.text = question.optionFour

    }
}