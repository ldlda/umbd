package vn.edu.usth.weather

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
//import android.widget.LinearLayout
//import android.widget.TextView
//import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class ForecastFragment : Fragment() {
    val TAG = "ForecastFragment"

    var nameResource: Int? = R.string.text_lda
    var name2Resource: Int? = null
    var iconResource: Int? = R.drawable.sunny_with_rain_light
    var name1: String? = null
    var name2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let { bundle ->
            nameResource = bundle.getInt("nameResource").takeIf { it != 0 }
            name2Resource = bundle.getInt("name2Resource").takeIf { it != 0 }
            iconResource = bundle.getInt("iconResource").takeIf { it != 0 }
            name1 = bundle.getString("name1")
            name2 = bundle.getString("name2")
        }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.i(TAG, "onCreateView: triggered")
        return inflater.inflate(R.layout.fragment_forecast, container, false)
            .apply { // kotlin goated for this lowk
                val textview = findViewById<TextView>(R.id.text_view_id)
                when {
                    nameResource != null -> {
                        Log.d(TAG, "onCreateView: did this run?")
                        textview.setText(nameResource!!) // woah unsafe shit yo
                    }
                    name1 != null -> {
                        textview.text = name1
                    }
                }

                iconResource?.let { resource ->
                    val drawable = ContextCompat.getDrawable(context, resource)
                    textview.setCompoundDrawablesRelativeWithIntrinsicBounds(
                        null, null, drawable, null
                    )
                }
                setBackgroundColor(listOf(0x200000FF, 0x2000FF00, 0x20FF0000).random()) // why here
                Log.d(TAG, "onCreateView: textview NOT changed???: ${textview.text}")
            }

    }

    companion object {
        fun cuh(nameResource: Int?, name2Resource: Int?, iconResource: Int?): ForecastFragment {
            return ForecastFragment().apply {
                arguments = Bundle().apply {
                    nameResource?.let { putInt("nameResource", it) }
                    name2Resource?.let { putInt("name2Resource", it) }
                    iconResource?.let { putInt("iconResource", it) }
                }
            }
        }

        fun cuh(name1: String?, name2: String?, iconResource: Int?): ForecastFragment {
            return ForecastFragment().apply {
                arguments = Bundle().apply {
                    name1?.let { putString("name1", it) }
                    name2?.let { putString("name2", it) }
                    iconResource?.let { putInt("iconResource", it) }
                }
            }
        }
    }
}