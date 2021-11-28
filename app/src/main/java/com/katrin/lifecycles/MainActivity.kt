package com.katrin.lifecycles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG="MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "У врат обители святой")
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "Стоял просящий подаянья бедняк ")
    }


    override fun onResume() {
        super.onResume()

        Log.d(TAG, "Иссохший, чуть живой")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "От жажды глада и страданья")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "Куска лишь хлеба он просил")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "...")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "И взор являл живую муку")
    }
}