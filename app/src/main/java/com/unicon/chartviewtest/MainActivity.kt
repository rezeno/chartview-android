package com.unicon.chartviewtest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.unicon.chartview.ChartViewStyle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chartview.values.add(22)
        chartview.values.add(15)
        chartview.values.add(44)

        // chartview.style.showBorder = false
        // chartview.style.showValues = false

        button.setOnClickListener {
            chartview.values.add(edittext.text.toString().toInt())
            chartview.update()
        }

        button2.setOnClickListener {
            chartview.values.add((Math.random()*40).toInt())
            chartview.update()
        }
    }
}