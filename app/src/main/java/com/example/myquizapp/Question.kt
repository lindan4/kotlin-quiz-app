package com.example.myquizapp

data class Question(
    val i: Int,
    val icFlagOfArgentina: Int,
    val s: String,
    val s1: String,
    val s2: String,
    val s3: String,
    val s4: String,
    val i2: Int
) {
    val id: Int

    val image: Int
    val questionString: String
    val optionOne: String
    val optionTwo: String

    val optionThree: String
    val optionFour: String

    val correctAnswer: Int
}