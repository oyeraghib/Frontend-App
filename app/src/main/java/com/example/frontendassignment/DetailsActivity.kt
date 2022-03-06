package com.example.frontendassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.layout_feed_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        tvAnswer.setOnClickListener {
            tvAnswer.visibility = View.GONE

            type_user.visibility = View.VISIBLE
            editText.visibility = View.VISIBLE
            ivMic.visibility = View.VISIBLE
            ivSend.visibility = View.GONE
        }

        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s?.trim()?.length == 0 && type_user.visibility == View.GONE) {
                    type_user.animation = AnimationUtils.loadAnimation(applicationContext, R.anim.push_up_in)
                    type_user.visibility = View.VISIBLE
                    editText.animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_in_left)
                    ivMic.animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_in_left)
                    ivSend.animation = AnimationUtils.loadAnimation(applicationContext, R.anim.push_up_out)
                    ivSend.visibility = View.GONE
                } else if (type_user.visibility == View.VISIBLE) {
                    type_user.animation = AnimationUtils.loadAnimation(applicationContext, R.anim.push_up_out)
                    type_user.visibility = View.GONE
                    editText.animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_in_right)
                    ivMic.animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_in_right)
                    ivSend.animation = AnimationUtils.loadAnimation(applicationContext, R.anim.push_up_in)
                    ivSend.visibility = View.VISIBLE
                }
            }
        })
    }
}