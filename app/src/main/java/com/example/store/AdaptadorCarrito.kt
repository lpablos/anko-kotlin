package com.example.store

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.AnkoContext

class AdaptadorCarrito (var data : ArrayList<ItemListPOJO>) : RecyclerView.Adapter<AdaptadorCarrito.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemList().createView(AnkoContext.Companion.create(parent!!.context, this, false)))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(data[position])
    }
    class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView) {
        val txtViewTitle by lazy {
            itemView.findViewById<TextView>(R.id.txtTitleItem)
        }
        val txtViewDesc by lazy {
            itemView.findViewById<TextView>(R.id.txtDescItem)
        }
        val txtViewPrice by lazy {
            itemView.findViewById<TextView>(R.id.txtPriceItem)
        }
        fun bindView(item: ItemListPOJO){
            with(item){
                txtViewTitle.text = title
                txtViewDesc.text = description
                txtViewPrice.text = price
            }

        }
    }
}

