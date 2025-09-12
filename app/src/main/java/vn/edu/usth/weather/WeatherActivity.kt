package vn.edu.usth.weather

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WeatherActivity : AppCompatActivity() {
    val TAG = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

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

