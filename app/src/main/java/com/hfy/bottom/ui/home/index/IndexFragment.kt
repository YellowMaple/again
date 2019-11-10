package com.hfy.bottom.ui.home.index

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.hfy.bottom.R
import com.hfy.bottom.databinding.FragmentIndexBinding
import com.hfy.bottom.domain.Sport


class IndexFragment : Fragment() {
    private lateinit var binding: FragmentIndexBinding
    private lateinit var viewModel: IndexViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIndexBinding.inflate(inflater, container, false)
        val adapter = SportListAdapter(SportClick {
            Toast.makeText(context,"test", Toast.LENGTH_LONG).show()
        })
        viewModel =ViewModelProviders.of(this).get(IndexViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_index, container, false)
        binding.sportList.adapter = adapter
        subscribeUi(adapter)
        return binding.root
    }
    private fun subscribeUi(adapter: SportListAdapter) {
        viewModel.sportsLiveData.observe(viewLifecycleOwner, Observer {
            adapter.sportsList=it
        })
    }


}

class SportClick(val block: (Sport) -> Unit) {
    fun onClick(video: Sport) = block(video)
}