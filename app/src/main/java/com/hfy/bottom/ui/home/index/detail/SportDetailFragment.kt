package com.hfy.bottom.ui.home.index.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.hfy.bottom.R


class SportDetailFragment : Fragment() {

    private lateinit var dashboardViewModel: SportDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProviders.of(this).get(SportDetailViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_sport_detail, container, false)
        val textView: TextView = root.findViewById(R.id.text_sport_detail)
        dashboardViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}