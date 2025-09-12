package vn.edu.usth.weather

import android.app.Activity
import android.os.Bundle
import android.util.Log

class WeatherActivity : Activity() {
    val TAG = "WeatherActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate: triggered")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: triggered")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: triggered")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: triggered")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: triggered")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: triggered")
    }
}