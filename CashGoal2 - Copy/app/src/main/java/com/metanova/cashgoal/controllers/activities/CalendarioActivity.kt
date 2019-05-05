package com.metanova.cashgoal.controllers.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.metanova.cashgoal.R
import kotlinx.android.synthetic.main.activity_calendario.*

class CalendarioActivity : AppCompatActivity() {
    var agregar_activo : Boolean = false
    var saldo: Double = 453.30

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
        setContentView(R.layout.activity_calendario)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        buttonEgresos.visibility = View.GONE
        buttonIngresos.visibility = View.GONE
        val saldoText : String = "Saldo: S/. $saldo"
        textViewSaldo2.text = saldoText

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
        floatingActionButtonAgregar.setOnClickListener{
            agregar_activo = !agregar_activo
            if (agregar_activo){
                buttonEgresos.visibility = View.VISIBLE
                buttonIngresos.visibility = View.VISIBLE
            } else
            {
                buttonEgresos.visibility = View.GONE
                buttonIngresos.visibility = View.GONE
            }
        }
        buttonEgresos.setOnClickListener{
            val intent = Intent(this, CrearEgresoActivity::class.java)
            startActivity(intent)
        }
        buttonIngresos.setOnClickListener{
            val intent = Intent(this,CrearIngresoActivity::class.java)
            startActivity(intent)
        }
    }
}
