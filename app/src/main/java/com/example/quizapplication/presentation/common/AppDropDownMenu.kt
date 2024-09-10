package com.example.quizapplication.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quizapplication.R
import com.example.quizapplication.util.Dimens
import com.example.quizapplication.util.Dimens.SmallSpacerHeight

@Preview
@Composable
fun Prev()
{
    val list =ListOf("Item 1","Item 2")
    AppDropDownMenu(menuName="Drop Down",menuList=list, onDropDownClick={})
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppDropDownMenu(
    menuName :String,
    menuList:List<String>,
onDropDownClick:(String) Unit
) {
    var isExpanded: by remember{
        mutableStateOf(false)
    }
    var selectedText by remember {
        mutableStateOf(menuList[0])
    }
    Column(
        modifier = Modifier
            .fillmaxWidth()
            .padding(horizontal = Dimens.MediumPadding),

        )
    {
        Text(
            text = menuName,
            style = MaterialTheme.typograohy.titleMedium,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color, blue_grey),

            )
        Spacer(modifier = Modifier.height(SmallSpacerHeight))

        ExposedDropdownMenuBox(
            expanded = isExpanded,
            onExpandedChange = { isExpanded = !isExpanded }
        ) {
            OutlinedTextField(

                modifier = Modifier
                    .menuAnchor()
                    .fillMaxWidth(),
                value = selectedText,
                onValueChange = { },
                readOnly = true,
                trailingIcon = {
                    ExposedDropdownDefaults.TrailingIcon(expanded = isExpanded)
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = colorResource(id = R.color.blue_grey),
                    unfocusedTrailingIconColor = colorResource(id = R.color.orange),
                    focusedTrailingIconColor = colorResource(is = R.color.orange
                ),
                focusedBorderColor = colorResource(id = R.color.dark_slate_blue)
                        unfocusedBorderColor = colorResource (id = R.color.dark_slate_blue),
                containerColor = colorResource(id = R.color.dark_slate_blue)
            ),
            shape = RoundedCornerShape(15.dp)
            )
            DropdownMenu(
                modifier = Modifier.background(
                    colorResource(id = R.color.mid_night_blue)
                ),
                expanded = isExpanded,
                onDismissRequest = { isExpanded = false },

                ) {
                menuList.forEachIndexed {
                    index:Int, text:String
                    DropdownMenuItem(
                        text = {
                            Text(
                                text = text,
                                color = colorResource(id = R.color.blue_grey)
                            )/*TODO*/
                        },
                        onClick = {
                            selectedText = menuList[index]
                            isExpanded = false
                        },
                        contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                    )
                }
            }
        }
    }
}





















    }
}