package com.example.business

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var signup=findViewById<TextView>(R.id.signup);
        signup.setOnClickListener {
            var intent=Intent(this,Register::class.java)
            startActivity(intent)
        }
        var signin=findViewById<TextView>(R.id.signin);
       signin.setOnClickListener(this);
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var email = findViewById<TextInputEditText>(R.id.email);
        var pass = findViewById<TextInputEditText>(R.id.pass);
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(p0: View?) {

    }
}