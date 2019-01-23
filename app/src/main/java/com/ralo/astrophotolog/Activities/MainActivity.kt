package com.ralo.astrophotolog.Activities

import android.os.Bundle
import android.widget.TextView
import com.ralo.astrophotolog.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameText = findViewById<TextView>(R.id.textView)
        nameText.setText("KOTLIN BRAT - DIZNILEND")
    }
}
