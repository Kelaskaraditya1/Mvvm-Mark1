package com.starkindustries.mvvmmark1.Ui
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.starkindustries.mvvmmark1.Factory.MainViewModelFactory
import com.starkindustries.mvvmmark1.LifeCycleObserver.MainActivityObserver
import com.starkindustries.mvvmmark1.R
import com.starkindustries.mvvmmark1.ViewModel.MainActivityViewModel
import com.starkindustries.mvvmmark1.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var viewModel:MainActivityViewModel
    var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        lifecycle.addObserver(MainActivityObserver())
        viewModel=ViewModelProvider(this,MainViewModelFactory(69)).get(MainActivityViewModel::class.java)
        setText()
        binding.countButton.setOnClickListener()
        {
            setText()
        }
        Log.d("OnCreate","On Create of MainActivty")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onPause() {
        super.onPause()
        Log.d("OnPause","On Pause of MainActivity")
    }
    fun setText()
    {
        viewModel.increment()
        binding.count.setText(viewModel.count.toString())
    }
}