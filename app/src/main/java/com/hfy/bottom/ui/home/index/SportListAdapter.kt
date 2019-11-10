package com.hfy.bottom.ui.home.index

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.hfy.bottom.R
import com.hfy.bottom.databinding.ItemFragmentSportsBinding
import com.hfy.bottom.domain.Sport


class SportListAdapter(val callBack:SportClick) :
    RecyclerView.Adapter<SportListAdapter.ViewHolder>() {

    var sportsList: List<Sport> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_fragment_sports, parent, false
            )
        )
    }
    override fun getItemCount(): Int {
        return sportsList.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.also {
            it.sport=sportsList[position]
            it.callback=callBack
        }
    }

    class ViewHolder(
        val binding: ItemFragmentSportsBinding
    ) : RecyclerView.ViewHolder(binding.root)
}