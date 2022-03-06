package com.example.a9

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.load
import java.util.*

class MainActivity : AppCompatActivity() {
    private val arr = arrayListOf("https://www.planetware.com/wpimages/2020/02/france-in-pictures-beautiful-places-to-photograph-eiffel-tower.jpg",
            "https://cdn.pixabay.com/photo/2021/08/25/20/42/field-6574455__340.jpg",
            "https://images.unsplash.com/photo-1541963463532-d68292c34b19?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max",
            "https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "https://media.istockphoto.com/photos/autumn-morning-at-the-cathedral-picture-id621235832?k=20&m=621235832&s=612x612&w=0&h=M072MpUXno496zSC7RmDv1Qy_JnFZ3pdFVw7zayYOEw=")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create imageview
        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.load(arr[Random().nextInt(arr.size)])


        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            //load by coil
            imageView.load(arr[Random().nextInt(arr.size)])

            //random
            val rnd = Random()
            val color: Int = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))

            button.setBackgroundColor(color)
        }
    }
}