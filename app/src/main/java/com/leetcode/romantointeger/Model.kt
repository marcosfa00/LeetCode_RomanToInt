package com.leetcode.romantointeger

class Model {

    fun romanToInt():Int{
        //First step is to read the Roman Numberv from end to the begining
        var result =0
        var prevResult =0;

        for (i in Data.romanNumber.value.length -1 downTo 0){
            var currentValue = Data.romanDictionary[Data.romanNumber.value[i]]?:0

            if (prevResult> currentValue){
                result -= currentValue
            }else{
                result += currentValue
            }
            prevResult = currentValue
        }

        return result
    }

    fun itsRoman(it:String):Boolean{

            if (!Data.romanDictionary.containsKey(it.last())){
                return false
            }

        return true

    }
}

