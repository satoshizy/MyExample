package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class RadioButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)
        val mRg1 = findViewById<RadioGroup>(R.id.rg_1)
        mRg1.setOnCheckedChangeListener { group, checkedId ->
            val radioButton=group.findViewById<RadioButton>(checkedId)
            Toast.makeText(this,radioButton.text,Toast.LENGTH_SHORT).show()
        }
    }
}
