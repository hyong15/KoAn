package com.example.hyong.koan.feature

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast

class KoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ko)
        nullExercise()//空练习
        extraExercise()//扩展方法
    }

    private fun extraExercise() {
        fun Fragment.toast(message:CharSequence, duration:Int = Toast.LENGTH_LONG){
            Toast.makeText(activity, message, duration).show()
        }
    }

    private fun nullExercise() {
        var notNullArtist:BeanData?=null
        val beanData:BeanData? = BeanData(0, "s", "1")
        val toString = beanData?.toString()
        val name = beanData?.name ?: "empty"
        Log.e("HYONG1", name)
    }
}
