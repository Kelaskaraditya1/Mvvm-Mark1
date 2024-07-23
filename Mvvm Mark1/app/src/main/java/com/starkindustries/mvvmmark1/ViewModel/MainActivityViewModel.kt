package com.starkindustries.mvvmmark1.ViewModel
import androidx.lifecycle.ViewModel
class MainActivityViewModel(val counter:Int):ViewModel() {
    var count:Int=counter
    fun increment()
    {
        count++
    }
}