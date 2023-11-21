package com.example.myquizapp

data class Question(
    val id: Int,
    val image: Int,
    val questionString: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)