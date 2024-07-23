package com.starkindustries.mvvmmark1.LifeCycleObserver
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModel

class MainActivityObserver:LifecycleObserver{
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate()
    {
        Log.d("OnCreate","OnCreate of MainActivity Lifecycle Observer")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause()
    {
        Log.d("OnPause","On Pause of Lifecycle Observer")
    }
}