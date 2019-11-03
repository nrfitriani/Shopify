package com.dicoding.picodiploma.shopify

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picodiploma.shopify.model.Item

class ListItemAdapter(private val listItem: ArrayList<Item>) : RecyclerView.Adapter<ListItemAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = listItem[position]
        Glide.with(holder.itemView.context)
            .load(item.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = item.name
        holder.tvDetail.text = item.detail

        holder.itemView.setOnClickListener{
            val moveDetailHero = Intent(holder.itemView.context, Itemdetail::class.java)
            moveDetailHero.putExtra(Itemdetail.EXTRA_NAME, listItem[holder.adapterPosition].name)
            moveDetailHero.putExtra(Itemdetail.EXTRA_DETAIL, listItem[holder.adapterPosition].detail)
            moveDetailHero.putExtra(Itemdetail.EXTRA_PHOTO, listItem[holder.adapterPosition].photo)
            holder.itemView.context.startActivity(moveDetailHero)
        }
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}
