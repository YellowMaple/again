package com.hfy.bottom.ui.home.build

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.hfy.bottom.R
import com.hfy.bottom.databinding.FragmentBuildBinding
import com.hfy.bottom.databinding.FragmentIndexBinding
import com.hfy.bottom.ui.home.index.IndexViewModel
import com.hfy.bottom.ui.home.index.SportClick
import com.hfy.bottom.ui.home.index.SportListAdapter


class BuildFragment : Fragment() {

    private lateinit var viewModel: BuildViewModel
    private lateinit var binding: FragmentBuildBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBuildBinding.inflate(inflater, container, false)
        val adapter = SportListAdapter(SportClick {
            Toast.makeText(context,"test", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_navigation_home_to_sportDetailFragment)
        })
        viewModel =ViewModelProviders.of(this).get(BuildViewModel::class.java)
        inflater.inflate(R.layout.fragment_build, container, false)
        binding.availableSportList.adapter = adapter
        subscribeUi(adapter)
        return binding.root
    }
    private fun subscribeUi(adapter: SportListAdapter) {
        viewModel.sportsLiveData.observe(viewLifecycleOwner, Observer {
            adapter.sportsList=it
        })
    }
}