package com.example.activityalvarez

import android.content.ContentValues.TAG
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v(TAG, "This is a verbose log.")
        Log.d(TAG, "This is a debug log.")
        Log.i(TAG, "This is an info log.")
        Log.w(TAG, "This is a warn log.")
        Log.e(TAG, "This is an error log.")

       // Button button = (Button) findViewbyId(R.id.button2)
        //button.setOnClickListener(new View.OnClickListener())
    }
}