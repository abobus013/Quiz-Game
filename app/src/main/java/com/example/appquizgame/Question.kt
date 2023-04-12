package com.example.quizgame

data class Question(
    val id: Int,
    val questionCount: Int,
    val questions: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val photo: Int,
    val correctAnswer: Int,

)
