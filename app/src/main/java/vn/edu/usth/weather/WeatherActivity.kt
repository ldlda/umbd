package vn.edu.usth.weather

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class WeatherActivity : AppCompatActivity() {
    val TAG = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate: triggered")
        val fragment = ForecastFragment()

        // lowkey cant jus do whatever teach says
        // get__ turns to __ in kotlin WTF
        supportFragmentManager.beginTransaction().add(
            R.id.main, fragment
        ).commit()
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

