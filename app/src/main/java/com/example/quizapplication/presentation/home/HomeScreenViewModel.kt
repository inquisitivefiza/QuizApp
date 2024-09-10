package com.example.quizapplication.presentation.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class HomeScreenViewModel : ViewModel()
{
    private val _homeState= MutableStateFlow(StateHomeScreen())
    val homeState=_homeState

    fun onEvent(event : EventHomeScreen) {
        when (event) {
            is EventHomeScreen.SetNumberOfQuizzes -> {
             _homeState.value= _homeState.value.copy(numberOfQuizzes = event.numberOfQuizzes)
            }

            is EventHomeScreen.SetQuizzesCategory -> {
                _homeState.value= _homeState.value.copy(category = event.category)

            }

            is EventHomeScreen.SetQuizzesDifficulty -> {
                _homeState.value= _homeState.value.copy(difficulty = event.difficulty)

            }

            is EventHomeScreen.SetQuizzesType -> {
                _homeState.value= _homeState.value.copy(type = event.type)
            }
        }

    }
}