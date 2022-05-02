package com.example.wb_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import com.example.wb_2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private var binding: ActivitySecondBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SecondActivity lifecycle", "onCreate()")
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FirstFragment()).commit()
        }
    }

    override fun onStart() {
        Log.d("SecondActivity lifecycle", "onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.d("SecondActivity lifecycle", "onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.d("SecondActivity lifecycle", "onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.d("SecondActivity lifecycle", "onStop()")
        super.onStop()
    }

    override fun onRestart() {
        Log.d("SecondActivity lifecycle", "onRestart()")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d("SecondActivity lifecycle", "onDestroy()")
        binding = null
        super.onDestroy()
    }
}