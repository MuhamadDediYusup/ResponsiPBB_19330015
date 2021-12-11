package com.ysp.responsippb

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.text.NumberFormat
import java.util.*
import kotlin.collections.ArrayList

class ListProductAdapter2(private val listProduct : ArrayList<Product>): RecyclerView.Adapter<ListProductAdapter2.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_product2, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val product = listProduct[position]
        //conversi int ke format uang IDR
        val format: NumberFormat = NumberFormat.getCurrencyInstance()
        format.setMaximumFractionDigits(0)
        format.setCurrency(Currency.getInstance("IDR"))
        val hargaProduk = format.format(product.hargaProduct)

        Glide.with(holder.itemView.context)
            .load(product.fotoProduct)
            .apply(RequestOptions().override(550, 550))
            .into(holder.fotoProduk)

        holder.namaProduct.text = product.namaProduct
        holder.hargaProduct.text = hargaProduk.toString()
    }

    override fun getItemCount(): Int {
        return listProduct.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var namaProduct: TextView = itemView.findViewById(R.id.nama_produk)
        var hargaProduct : TextView = itemView.findViewById(R.id.harga_produk)
        var fotoProduk : ImageView = itemView.findViewById(R.id.foto_produk)
    }
}