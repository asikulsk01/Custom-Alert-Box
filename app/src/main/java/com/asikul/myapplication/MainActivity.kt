package com.asikul.myapplication

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //Create a variable type of Dialog
    lateinit var dialog : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var myButton = findViewById<Button>(R.id.btnClickme)
        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))


        //Creating variable for the custom dialog.xml design
        var btnGood = dialog.findViewById<Button>(R.id.btnGood)
        var btnFeedback = dialog.findViewById<Button>(R.id.btnFeedback)

        btnGood.setOnClickListener {
            dialog.dismiss()
        }
        btnFeedback.setOnClickListener {
            //Intent to take the user to a google form.
        }

        myButton.setOnClickListener {
            dialog.show()
        }
    }
}



