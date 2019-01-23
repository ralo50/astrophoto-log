package com.ralo.astrophotolog

import android.app.Application
import android.content.Context
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity


class Astrophotolog : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = applicationContext
    }

    companion object {

        var instance: Context? = null
            private set
        var currentActivity: AppCompatActivity? = null

        val fragmentSupportManager: FragmentManager
            get() = currentActivity!!.supportFragmentManager
    }

}