package com.example.quizapplication.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(){
    Column(
        modifier= Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
    ){
        HomeHeader()

        Spacer(modifier=Modifier.height(MediumSpacerHeight))
        AppDropDownMenu(menuName="Number of Questions:", menuList = Constants.numberssAsString,)

        Spacer(modifier=Modifier.height(SmallSpacerHeight))
        AppDropDownMenu(menuName="Select Category:", menuList = Constants.categories)

        Spacer(modifier=Modifier.height(SmallSpacerHeight))
        AppDropDownMenu(menuName="Select Difficulty:",menuList=difficulty)

        Spacer(modifier=Modifier.height(SmallSpacerHeight))
        AppDropDownMenu(menuName="Select Type:" , menuList=Constants.type)


    }
    )
}
