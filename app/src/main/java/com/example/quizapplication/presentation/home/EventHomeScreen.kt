package com.example.quizapplication.presentation.home

sealed  class EventHomeScreen {
    data class SetNumberOfQuizzes(val numberOfQuizzes :Int) :EventHomeScreen()
    data class SetQuizzesCategory(val category :String) : EventHomeScreen()
    data class SetQuizzesDifficulty(val difficulty :String) : EventHomeScreen()
    data class SetQuizzesType(val type :String) : EventHomeScreen()



}