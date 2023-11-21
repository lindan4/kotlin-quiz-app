package com.example.myquizapp

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.ComponentActivity

class QuizActivity : ComponentActivity() {


    private var currentQuestionIndex = 0
    private var questionImage: ImageView? = null

    private var progressBar: ProgressBar? = null
    private var progressBarText: TextView? = null


    private var firstOption: TextView? = null
    private var secondOption: TextView? = null
    private var thirdOption: TextView? = null
    private var fourthOption: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val questionsList = Constants.getQuestions()

        questionImage = findViewById(R.id.questionImg)

        progressBar = findViewById(R.id.progressBar)
        progressBarText = findViewById(R.id.progressBarStateNum)


        firstOption = findViewById(R.id.questionOptionOne)
        secondOption = findViewById(R.id.questionOptionTwo)
        thirdOption = findViewById(R.id.questionOptionThree)
        fourthOption = findViewById(R.id.questionOptionFour)

        val question = questionsList[currentQuestionIndex]

        progressBar?.progress = currentQuestionIndex
        progressBarText?.text = "${currentQuestionIndex + 1}/${questionsList.size}"

        questionImage?.setImageResource(question.image)

        firstOption?.text = question.optionOne
        secondOption?.text = question.optionTwo
        thirdOption?.text = question.optionThree
        fourthOption?.text = question.optionFour
    }
}