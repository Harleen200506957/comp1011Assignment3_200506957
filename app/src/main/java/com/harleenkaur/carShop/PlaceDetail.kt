package com.harleenkaur.carShop

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_place_detail.*

class PlaceDetail : AppCompatActivity() {
    private lateinit var obj: userDefinedData
    private var image: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_detail)
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        obj = intent.getParcelableExtra("myVisitingPlaceList")!!
        image = intent.getIntExtra("image", -1)
        setData(obj, image!!)

    }

    private fun setData(obj: userDefinedData, image: Int) {

        makeDetailId.text = obj.make
        modelDetailId.text= obj.model
        ratingDetailId.text = obj.condition
        yearDetailId.text = obj.year
        specs1.text = obj.engineCylinder
        specs2.text = obj.numberOfDoors
        specs3.text  = obj.price
        specs4.text = obj.color
        specs5.text = obj.dateSold
        tvDetailId.setImageResource(image)


    }
}