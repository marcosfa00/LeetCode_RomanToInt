package com.leetcode.romantointeger

import android.util.Log
import android.view.Display.Mode
import androidx.lifecycle.ViewModel

class MyViewModel :ViewModel() {

fun romanToInt():Int{
    val model = Model()
    val result = model.romanToInt()

    Log.d(Data.TAG,"$result")

    return result
}


 fun itsRoman(it:String):Boolean{
     var model = Model()
     var bool = model.itsRoman(it)
     return bool
 }


}