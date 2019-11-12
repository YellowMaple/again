package com.hfy.bottom.ui.home.index

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.hfy.bottom.R
import com.hfy.bottom.databinding.FragmentIndexBinding
import com.hfy.bottom.domain.Match
import com.hfy.bottom.ui.home.build.SportListAdapter


class IndexFragment : Fragment() {
    private lateinit var binding: FragmentIndexBinding
    private lateinit var viewModel: IndexViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIndexBinding.inflate(inflater, container, false)
        val adapter = MatchListAdapter(MatchClick {
            Toast.makeText(context, "test", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_navigation_home_to_sportDetailFragment)
        })
        viewModel =ViewModelProviders.of(this).get(IndexViewModel::class.java)
        inflater.inflate(R.layout.fragment_index, container, false)
        binding.sportList.adapter = adapter
        subscribeUi(adapter)
        return binding.root
    }
    private fun subscribeUi(adapter: MatchListAdapter) {
        viewModel.sportsLiveData.observe(viewLifecycleOwner, Observer {
            adapter.matchList=it
        })
    }
}

class MatchClick(val block: (Match) -> Unit) {
    fun onClick(match: Match) = block(match)
}

