package com.metanova.cashgoal.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AutoCompleteTextView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.metanova.cashgoal.R
import com.metanova.cashgoal.models.TipoIngreso
import kotlinx.android.synthetic.main.item_tipo_ingreso.view.*


class TipoIngresoAdapter(var tipoIngresos: List<TipoIngreso>) :
        RecyclerView.Adapter<TipoIngresoAdapter.ViewHolder>(){

    class ViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView = itemView.textViewNombre


        fun bindTo(tipoIngreso: TipoIngreso) {
            textView.text = tipoIngreso.nombre
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tipo_ingreso, parent, false) as TextView
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return tipoIngresos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindTo(tipoIngresos[position])
    }





}