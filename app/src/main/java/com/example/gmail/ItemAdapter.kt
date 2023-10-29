package com.example.gmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ItemAdapter(val items: ArrayList<ItemModel>): BaseAdapter() {
    override fun getCount(): Int = items.size

    override fun getItem(pos: Int) = items[pos]

    override fun getItemId(pos: Int) = pos.toLong()

    override fun getView(pos: Int, convertView: View?, parent: ViewGroup?): View {
        val itemView: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            itemView = LayoutInflater.from(parent?.context).inflate(R.layout.layout_item, parent, false)
            viewHolder = ViewHolder(itemView)
            itemView.tag = viewHolder
        } else {
            itemView = convertView
            viewHolder = itemView.tag as ViewHolder
        }

        viewHolder.avatar.text = items[pos].name[0].toString()
        viewHolder.name.text = items[pos].name
        viewHolder.header.text = items[pos].title
        viewHolder.content.text = items[pos].content
        viewHolder.time.text = items[pos].time

        if (items[pos].ticked) {
            viewHolder.favorite.setImageResource(R.drawable.favorite_ticked)
        } else {
            viewHolder.favorite.setImageResource(R.drawable.favorite)
        }

        viewHolder.favorite.setOnClickListener {
            items[pos].ticked = !items[pos].ticked
            notifyDataSetChanged()
        }

        return itemView
    }

    class ViewHolder(itemView: View) {
        val avatar: TextView
        val name: TextView
        val header: TextView
        val content: TextView
        val time: TextView
        val favorite: ImageView

        init {
            avatar = itemView.findViewById(R.id.avatar)
            name = itemView.findViewById(R.id.name)
            header = itemView.findViewById(R.id.header)
            content = itemView.findViewById(R.id.content)
            time = itemView.findViewById(R.id.time)
            favorite = itemView.findViewById(R.id.favorite)
        }
    }
}