package com.example.frontendassignment

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.widget.PopupWindow
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.frontendassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private lateinit var adapter: RecyclerViewAdapter
    private lateinit var binding: ActivityMainBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager

        adapter = RecyclerViewAdapter()
        binding.recyclerView.adapter = adapter

        binding.imageButtonLocation.setOnClickListener{ v->
            Toast.makeText(this, "Location is clicked", Toast.LENGTH_SHORT).show()


//            val dialogBuilder = AlertDialog.Builder(this)
//            val dialogView = layoutInflater.inflate(R.layout.location_layout, null)
//
//            dialogBuilder.setView(dialogView)
//            val alertDialog = dialogBuilder.create()
//            alertDialog.show()

        }

    }
}