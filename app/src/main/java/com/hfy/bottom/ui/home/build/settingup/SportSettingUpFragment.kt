package com.hfy.bottom.ui.home.build.settingup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.navArgs
import com.hfy.bottom.R


class SportSettingUpFragment : Fragment() {

    private val args: SportSettingUpFragmentArgs by navArgs()
    private lateinit var viewModel: SportSettingUpViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =SportSettingUpViewModel(args.sportId)
//            ViewModelProviders.of(this).get(SportSettingUpViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_sport_setting_up, container, false)
        val textView: TextView = root.findViewById(R.id.text_sport_setting_up)

        viewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}