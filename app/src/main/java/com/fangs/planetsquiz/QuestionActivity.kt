package com.fangs.planetsquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    private val celestialBodies = Constants.getCelestialBodies()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)




    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)

        val bouncy = AnimationUtils.loadAnimation(this, R.anim.bouncy)
        tv_greet_user.startAnimation(bouncy)


        val imageList = ArrayList<ImageView>()
        imageList.add(iv_sun)
        imageList.add(iv_moon)
        imageList.add(iv_mercury)
        imageList.add(iv_venus)
        imageList.add(iv_earth)
        imageList.add(iv_mars)
        imageList.add(iv_jupiter)
        imageList.add(iv_saturn)
        imageList.add(iv_uranus)
        imageList.add(iv_neptune)

        for (image in imageList){
            val rotate = android.view.animation.AnimationUtils.loadAnimation(this,R.anim.rotate)
            image.startAnimation(rotate)
        }




    }



}