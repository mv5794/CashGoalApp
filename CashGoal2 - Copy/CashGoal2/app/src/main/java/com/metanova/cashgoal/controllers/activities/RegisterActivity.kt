package com.metanova.cashgoal.controllers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metanova.cashgoal.R
import com.metanova.cashgoal.models.Usuario
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        buttonCreateUser.setOnClickListener{
            //var usuario:Usuario()
        }
    }
}
