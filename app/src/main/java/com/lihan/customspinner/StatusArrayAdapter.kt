package com.lihan.customspinner

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.cardview.widget.CardView


class StatusArrayAdapter(
    private val context : Context,
    var data : List<Status>
)  : BaseAdapter(){

    override fun getCount() = data.size

    override fun getItem(p0: Int): Any {
        return data[p0]
    }

    override fun getItemId(p0: Int): Long = p0.toLong()

    @SuppressLint("ViewHolder")
    override fun getView(p0: Int, p1: View?, viewGroup: ViewGroup?): View {
        val rootView = LayoutInflater.from(context).inflate(
            R.layout.item_status,viewGroup,false
        )
        val status = data[p0]
        val statusString = rootView.findViewById<TextView>(R.id.statusString)
        val statusLight = rootView.findViewById<TextView>(R.id.statusLight)
        val csl = ColorStateList.valueOf(status.color)
        val statusCardView = rootView.findViewById<CardView>(R.id.statusCardView)
        statusCardView.backgroundTintList = csl
        statusString.text = status.text
        statusLight.backgroundTintList = csl
        return rootView
    }

}