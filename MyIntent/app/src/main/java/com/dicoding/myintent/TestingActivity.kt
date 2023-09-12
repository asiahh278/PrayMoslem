package com.dicoding.myintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class TestingActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnSetValue: Button
    private lateinit var tvTesting: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testing)

        tvTesting = findViewById(R.id.tv_testing)
        btnSetValue = findViewById(R.id.btn_set_value)

        btnSetValue!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_set_value)
            tvTesting.text = "19"
    }
}