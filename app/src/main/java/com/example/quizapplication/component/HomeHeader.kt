package com.example.quizapplication.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import com.example.quizapplication.R

fun HomeHeader(){
    Box(
        modifier=Modifier
            .fillMaxWidth()
            .height(Dimens.HomeTopBoxHeight)
            .background(
                color=colorResource(id= R.color.dark_slate_blue),
                shape= RoundedCornerShape(
                    bottomStart=Dimens.ExtraLargeCornerRadius,
                    bottomEnd=Dimens.ExtraLargeCornerRadius
                ),
            )
    )
    {
        Row(
            modifier=Modifier
                .fillMaxWidth()
                .padding(top=Dimens.LargePadding),
            horizontalArrangement= Arrangement.SpaceBetween,
            verticalAlignment= Alignment.CenterVertically,
            )
        {
            Icon(
               painterResource(id=R.drawable.baseline_menu_open_24),
                contentDescription="",
                modifier=Modifier.weight(1f)
                    .size(Dimens.MediumIconSize),
                tint=colorResource(id= R.color.blue_grey)
            )
        }
    }
}