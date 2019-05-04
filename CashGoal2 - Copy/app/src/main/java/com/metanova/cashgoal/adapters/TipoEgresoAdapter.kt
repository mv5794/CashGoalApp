package com.metanova.cashgoal.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.metanova.cashgoal.R
import com.metanova.cashgoal.models.TipoEgreso
import kotlinx.android.synthetic.main.item_tipo_egreso.view.*

class TipoEgresoAdapter(var tipoEgresos : List<TipoEgreso>) :
    RecyclerView.Adapter<TipoEgresoAdapter.ViewHolder>(){


    class ViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView = itemView.textViewNombre


        fun bindTo(tipoIngreso: TipoEgreso) {
            textView.text = tipoIngreso.nombre
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tipo_ingreso, parent, false) as TextView
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return tipoEgresos.size
    }

    override fun onBindViewHolder(holder: TipoEgresoAdapter.ViewHolder, position: Int) {
        holder.bindTo(tipoEgresos[position])
    }


}