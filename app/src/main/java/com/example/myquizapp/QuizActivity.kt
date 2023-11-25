package com.example.myquizapp

import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat
import java.util.ArrayList

class QuizActivity : ComponentActivity(), View.OnClickListener {



    private val optionTextViews: ArrayList<TextView> = ArrayList<TextView>()

    private var currentQuestionIndex = 0

    private var selectedAnswerIndex = 0
    private var correctAnswerIndex = 0

    private val questionsList = Constants.getQuestions()
    private var questionImage: ImageView? = null

    private var progressBar: ProgressBar? = null
    private var progressBarText: TextView? = null


    private var firstOption: TextView? = null
    private var secondOption: TextView? = null
    private var thirdOption: TextView? = null
    private var fourthOption: TextView? = null

    private var submitButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        questionImage = findViewById(R.id.questionImg)

        progressBar = findViewById(R.id.progressBar)
        progressBarText = findViewById(R.id.progressBarStateNum)


        firstOption = findViewById(R.id.questionOptionOne)
        secondOption = findViewById(R.id.questionOptionTwo)
        thirdOption = findViewById(R.id.questionOptionThree)
        fourthOption = findViewById(R.id.questionOptionFour)

        firstOption?.setOnClickListener(this)
        secondOption?.setOnClickListener(this)
        thirdOption?.setOnClickListener(this)
        fourthOption?.setOnClickListener(this)

        submitButton = findViewById(R.id.submitButton)

        setQuestion(currentQuestionIndex)
    }

    override fun onStart() {
        super.onStart()

        firstOption?.let { optionTextViews.add(0, it) }
        secondOption?.let { optionTextViews.add(1, it) }
        thirdOption?.let { optionTextViews.add(2, it) }
        fourthOption?.let { optionTextViews.add(3, it) }

        submitButton?.alpha = 0.5F
    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.questionOptionOne -> {
                firstOption?.let {
                    onOptionSelect(1, it)
                }
            }
            R.id.questionOptionTwo -> {
                secondOption?.let {
                    onOptionSelect(2, it)
                }
            }
            R.id.questionOptionThree -> {
                thirdOption?.let {
                    onOptionSelect(3, it)
                }
            }
            R.id.questionOptionFour -> {
                fourthOption?.let {
                    onOptionSelect(4, it)
                }
            }
        }

    }

    private fun resetOptionStyling() {
        if (optionTextViews.size > 0) {
            for (optionTextView in optionTextViews) {
                optionTextView.typeface = Typeface.DEFAULT
                optionTextView.setTextColor(ContextCompat.getColor(this, R.color.defaultOptionTextColor))
                optionTextView.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
            }
        }

    }

    private fun onOptionSelect(selectedIndex: Int, selectedTextView: TextView) {
        resetOptionStyling()
        selectedTextView.typeface = Typeface.DEFAULT_BOLD
        selectedTextView.setTextColor(ContextCompat.getColor(this, R.color.primaryColor))
        selectedTextView.background = ContextCompat.getDrawable(this, R.drawable.selection_option_border_bg)
        selectedAnswerIndex = selectedIndex
        submitButton?.alpha = 1F
        submitButton?.isEnabled = true
        submitButton?.isClickable = true
    }


    private fun setQuestion(questionIndex: Int) {
        resetOptionStyling()
        val question = questionsList[questionIndex]

        progressBar?.progress = questionIndex + 1
        progressBarText?.text = "${questionIndex + 1}/${questionsList.size}"

        questionImage?.setImageResource(question.image)

        firstOption?.text = question.optionOne
        secondOption?.text = question.optionTwo
        thirdOption?.text = question.optionThree
        fourthOption?.text = question.optionFour

        correctAnswerIndex = question.correctAnswer

        submitButton?.isEnabled = false
        submitButton?.isClickable = false
        submitButton?.alpha = 0.5F
    }
}