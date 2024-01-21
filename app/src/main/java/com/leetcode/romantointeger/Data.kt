package com.leetcode.romantointeger

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import java.util.Dictionary

object Data {
    val TAG = "RESULT"
    val romanDictionary = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    val romanNumber : MutableState<String> = mutableStateOf("")
}