package com.metanova.cashgoal.controllers.activities

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.metanova.cashgoal.R
import com.metanova.cashgoal.adapters.MetaAdapter
import com.metanova.cashgoal.models.Meta
import com.metanova.cashgoal.models.TipoMeta
import com.metanova.cashgoal.models.Usuario
import kotlinx.android.synthetic.main.activity_meta.*
import java.math.BigDecimal

class MetaActivity : AppCompatActivity() {

    var metas: List<Meta> = ArrayList()
    lateinit var metaAdapter :MetaAdapter


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
        setContentView(R.layout.activity_meta)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val meta1: Meta = Meta( Usuario("a","a","a","a"), TipoMeta("herramienta","para la uni"), BigDecimal(1500), BigDecimal(200),"Laptop para la universidad","PEN", "Laptop")
        progressBar2.setProgress(meta1.ahorrado.toInt()/meta1.monto.toInt()*100)
        progressBar2.max = meta1.monto.toInt()
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
