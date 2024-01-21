# ROMAN TO INT

CONVERT A ROMAN NUMBER TO ARABIC (DECIMAL) NUMBER

# Description
Given a function whose input parameter is a String with Correct **ROMAN NUMERALS**, return **DECIMALS**

examples: 

**Example 1:**

    Input: s = "III"
    Output: 3
    Explanation: III = 3.

**Example 2:**

    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.

**Example 3:**

    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

## SOLUTION

```Kotlin
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
```

