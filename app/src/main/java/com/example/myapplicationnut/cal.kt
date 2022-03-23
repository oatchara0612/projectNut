package com.example.myapplicationnut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class cal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal)

        var numberinput=findViewById<EditText>(R.id.Number)
        var cal=findViewById<Button>(R.id.cal)
        var numberoutput=findViewById<TextView>(R.id.result)

        cal.setOnClickListener {
            var output = numberinput.text.toString().toDouble()*7/100
            numberoutput.text=output.toString()
            Log.v("Result",output.toString())

        }
    }
}