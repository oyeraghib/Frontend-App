package com.example.frontendassignment

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.*
import android.widget.PopupWindow
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.frontendassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ivLocation.setOnClickListener {
            val dialog = Dialog(this)
            val window: Window = dialog.window!!
            val wmLp = window.attributes
            wmLp.gravity = Gravity.TOP
            wmLp.width = WindowManager.LayoutParams.MATCH_PARENT
            wmLp.height = WindowManager.LayoutParams.WRAP_CONTENT
            window.attributes = wmLp
            dialog.setContentView(R.layout.layout_popup)
            dialog.setCancelable(true)
            dialog.setCanceledOnTouchOutside(true)
            dialog.show()
        }

        card_view.setOnClickListener {
            val i = Intent(this, DetailsActivity::class.java)
            startActivity(i)
        }
    }
}