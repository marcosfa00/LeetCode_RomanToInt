package com.leetcode.romantointeger.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.dp
import com.leetcode.romantointeger.Data
import com.leetcode.romantointeger.Model
import com.leetcode.romantointeger.MyViewModel
import java.util.Locale

@Composable
fun Greeting(model: MyViewModel){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .wrapContentSize(Alignment.Center)
    ) {
        Inputs(model,name = "Roman Number")
        Calculate(model)

    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Inputs(model: MyViewModel, name: String) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = {

            if (model.itsRoman(it.uppercase())) {
                text = it.uppercase()
            }

           Data.romanNumber.value = text
        },
        label = {
            Text(text = name, color = Color.Gray)
        },
        modifier = Modifier.padding(top = 8.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Gray,
            unfocusedBorderColor = Color.Gray,
            textColor = Color.Black,
            cursorColor = Color.Black
        )
    )
}

@Composable
fun Calculate(model: MyViewModel){
    var result by remember { mutableStateOf(0) }
    Button(onClick = {
       result = model.romanToInt()


    }) {
        Text(text = "CALCULATE")
    }

    Text(text = if(result == 0)"" else result.toString())
}
