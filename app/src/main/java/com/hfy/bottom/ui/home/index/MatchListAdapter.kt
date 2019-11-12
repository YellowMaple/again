package com.hfy.bottom.ui.home.index

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.hfy.bottom.R
import com.hfy.bottom.databinding.ItemFragmentMatchBinding
import com.hfy.bottom.domain.Match


class MatchListAdapter(val callBack: MatchClick) :
    RecyclerView.Adapter<MatchListAdapter.ViewHolder>() {

    var matchList: List<Match> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_fragment_match, parent, false
            )
        )
    }
    override fun getItemCount(): Int {
        return matchList.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.also {
            it.match=matchList[position]
            it.callback=callBack
        }
    }

    class ViewHolder(
        val binding: ItemFragmentMatchBinding
    ) : RecyclerView.ViewHolder(binding.root)
}