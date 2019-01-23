package com.ralo.astrophotolog.Activities

import android.content.Context
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.FrameLayout
import com.ralo.astrophotolog.Astrophotolog
import com.ralo.astrophotolog.R

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper

abstract class BaseActivity : AppCompatActivity() {
    private var mainContainer: FrameLayout? = null
    private var child: View? = null

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = layoutInflater.inflate(R.layout.activity_base, null, false)
        setContentView(view)
        mainContainer = view.findViewById(R.id.main_container)
        setup()
    }

    private fun setup() {
        Astrophotolog.currentActivity = this
    }

    override fun setContentView(layoutResID: Int) {
        child = layoutInflater.inflate(layoutResID, null, false)
        mainContainer!!.addView(child)
    }

    override fun <T : View> findViewById(@IdRes id: Int): T {
        return child!!.findViewById(id)
    }
}