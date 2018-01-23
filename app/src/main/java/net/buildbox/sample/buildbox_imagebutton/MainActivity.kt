package net.buildbox.sample.buildbox_imagebutton

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageButton: ImageButton = findViewById(R.id.image_button)
        imageButton.setOnClickListener {
            Toast.makeText(this, "ボタンのクリック", Toast.LENGTH_SHORT).show()
        }
    }
}
