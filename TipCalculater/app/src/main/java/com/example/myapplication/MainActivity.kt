package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var imageView: ImageView? = null
    var educationDetails: Button? = null
    var persnolDetails: Button? = null
    var fb: Button? = null
    var insta: Button? = null
    var whats: Button? = null
    private var twitter: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.image)
        educationDetails = findViewById(R.id.Ed)
        persnolDetails = findViewById(R.id.Pd)
        fb = findViewById(R.id.fb)
        insta = findViewById(R.id.ig)
        whats = findViewById(R.id.wa)
        twitter = findViewById(R.id.tw)

        imageView?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, ProfileActivity::class.java)
            startActivity(intent)
        }
        educationDetails?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, EducationDetails::class.java)
            startActivity(intent)
        }
        persnolDetails?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, PersnolDetails::class.java)
            startActivity(intent)
        }
        fb?.setOnClickListener {
            var intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("www.facebook.com"))
            startActivity(intent)
        }
        insta?.setOnClickListener {
            var intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("www.instagram.com"))
            startActivity(intent)
        }
        whats?.setOnClickListener {
            var intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("www.whatsapp.com"))
            startActivity(intent)
        }
        twitter?.setOnClickListener {
            var intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("www.twitter.com"))
            startActivity(intent)
        }

    }
}