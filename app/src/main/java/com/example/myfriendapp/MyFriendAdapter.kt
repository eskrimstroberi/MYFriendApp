package com.example.myfriendapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_friends_item.view.*

class MyFriendAdapter(private val context: Context, private val items: ArrayList<MyFriend>) : RecyclerView.Adapter<MyFriendAdapter.ViewHolder>() {
   class VirewHolder (itemView:View):RecyclerView.ViewHolder(itemView) {
       private var txtFriendName: TextView = itemView.findViewById(R.id.txtFriendName)
       private var txtFriendEmail: TextView = itemView.findViewById(R.id.txtFriendEmail)
       private var txtFriendPhone: TextView = itemView.findViewById(R.id.txtFriendTelp)
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType:
    Int) =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.my_friends_item, parent, false))
    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {

        holder.bindItem(items.get(position))
    }
    override fun getItemCount(): Int = items.size
    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item: MyFriend) {
            containerView.txtFriendName.text = item.nama
            containerView.txtFriendEmail.text = item.email
            containerView.txtFriendTelp.text = item.telp
        }
    }
}