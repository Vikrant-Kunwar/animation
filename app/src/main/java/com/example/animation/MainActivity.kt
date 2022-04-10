package com.example.animation

import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.bounce);


        button.setOnClickListener {
            button.startAnimation(animation)
            Handler().postDelayed({
                val bottomSheetFragment = BottomSheetFragment()
                bottomSheetFragment.enterTransition = android.transition.Slide.MODE_IN
                bottomSheetFragment.exitTransition = android.transition.Slide.MODE_OUT
                bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
            }, 500)


        }

    }
}