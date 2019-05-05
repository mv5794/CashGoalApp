package com.metanova.cashgoal.controllers.activities

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.metanova.cashgoal.R

class UsuarioActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.navigation_calendar -> {
                val intent = Intent(this, CalendarioActivity::class.java)
                startActivity(intent)
            }
            R.id.navigation_notifications -> {
                val intent = Intent(this, MetaActivity::class.java)
                startActivity(intent)
            }
            R.id.navigation_perfil -> {
                val intent = Intent(this, UsuarioActivity::class.java)
                startActivity(intent)
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
