package com.starkindustries.mvvmmark1.Factory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.starkindustries.mvvmmark1.ViewModel.MainActivityViewModel

class MainViewModelFactory(val counter:Int):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainActivityViewModel(counter) as T
    }
}