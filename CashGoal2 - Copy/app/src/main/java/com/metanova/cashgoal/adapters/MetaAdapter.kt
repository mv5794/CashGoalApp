package com.metanova.cashgoal.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.metanova.cashgoal.R
import com.metanova.cashgoal.models.Meta
import kotlinx.android.synthetic.main.item_meta.view.*

class MetaAdapter (var metas: List<Meta>) :
    RecyclerView.Adapter<MetaAdapter.ViewHolder>(){
    class ViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView = itemView.textViewItemMeta
        val progressBar = itemView.progressBar


        fun bindTo(tipoIngreso: Meta) {
            textView.text = tipoIngreso.nombre
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_meta, parent, false) as TextView
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return metas.size
    }

    override fun onBindViewHolder(holder: MetaAdapter.ViewHolder, position: Int) {
        holder.bindTo(metas[position])
    }
}