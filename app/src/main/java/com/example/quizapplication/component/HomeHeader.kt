package com.example.quizapplication.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier

fun HomeHeader(){
    Box(
        modifier=Modifier
            .fillMaxWidth()
            .height(Dimens.HomeTopBoxHeight)
            .background(
                color=colorResource(id=R.color.dark_slate_blue),
                shape=RoundedCornerShape(
                    bottomStart=Dimens.ExtraLargeCornerRadius,
                    bottom=Dimens.ExtraLargeCornerRadius
                ),
            )
    )
    {
        Row(
            modifier=Modifier
                .fillMaxWidth()
                .padding(top=Dimens.LargePadding),
            horizontalArrangement=Arrangement.SpaceBetween,
            verticalAlignment= Alignment.CenterVertically,


        )
        {
            Icon(

            )
        }
    }
}