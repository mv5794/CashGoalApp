package com.metanova.cashgoal.controllers.activities

import android.os.Bundle
import android.widget.LinearLayout
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager
import com.metanova.cashgoal.R
import com.metanova.cashgoal.adapters.TipoIngresoAdapter

import kotlinx.android.synthetic.main.activity_tipo_ingreso.*

class TIpoIngresoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipo_ingreso)
        setSupportActionBar(toolbar)

        activity_tipo_ingreso_recyclerView.layoutManager = LinearLayoutManager(this)
        val tipoIngresos: List<com.metanova.cashgoal.models.TipoIngreso>

       //activity_tipo_ingreso_recyclerView.apply { adapter = TipoIngresoAdapter }

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
