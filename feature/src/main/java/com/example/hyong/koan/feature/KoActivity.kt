package com.example.hyong.koan.feature

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class KoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ko)
        nullExercise()
    }

    private fun nullExercise() {
        var notNullArtist:BeanData?=null
        val beanData:BeanData? = BeanData(0, "s", "1")
        val toString = beanData?.toString()
        val name = beanData?.name ?: "empty"
        Log.e("HYONG1", name)
    }
}
