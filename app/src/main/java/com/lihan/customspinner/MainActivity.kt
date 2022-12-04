package com.lihan.customspinner

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var userStatusSpinner : Spinner
    private lateinit var statusArrayAdapter: StatusArrayAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        statusArrayAdapter = StatusArrayAdapter(this,generateDumpData())
        userStatusSpinner = findViewById(R.id.userStatusSpinner)
        userStatusSpinner.adapter = statusArrayAdapter
        userStatusSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        });

    }



    private fun generateDumpData(): ArrayList<Status> {
        return arrayListOf(
            Status(Color.GREEN, "Online"),
            Status(Color.LTGRAY, "Offline"),
            Status(Color.RED, "Busy"),
            Status(Color.MAGENTA, "Idle"),
        )
    }
}