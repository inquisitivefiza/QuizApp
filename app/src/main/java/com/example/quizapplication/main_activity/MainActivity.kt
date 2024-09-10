package com.example.quizapplication.main_activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapplication.presentation.home.HomeScreenViewModel
import com.example.quizapplication.presentation.home.component.HomeScreen
import com.example.quizapplication.ui.theme.QuizApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizApplicationTheme {
                // A surface container using the 'background' color from the theme
             Box(
                 modifier = Modifier.fillMaxSize()
                     .background(color= colorResource(id =)),
                 contentAlignment = Alignment.Center
             )
             {

               val viewModel: HomeScreenViewModel = hiltViewModel()
                 val state by viewModel.homeState.collectAsState()
                 HomeScreen(
                     state =state,
                     event= viewModel::onEvent
                 )


                }
            }
        }
    }
}


