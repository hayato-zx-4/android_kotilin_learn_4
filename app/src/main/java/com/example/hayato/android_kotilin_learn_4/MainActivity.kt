package com.example.hayato.android_kotilin_learn_4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.style.ScaleXSpan
import android.view.animation.AnticipateOvershootInterpolator
import android.view.animation.BounceInterpolator
import android.view.animation.ScaleAnimation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView.setOnClickListener{
            it.animate().apply {
                interpolator = BounceInterpolator()
                duration = 3000L
                rotation(360.0f * 8)
                scaleX(2.0f)
                scaleY(2.0f)
                y(it.y + 100.0f)

            }
        }
    }
}
