package com.hfy.bottom.ui.home.build.settingup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.hfy.bottom.databinding.FragmentSportSettingUpBinding
import com.hfy.bottom.extentions.logd
import com.hfy.bottom.extentions.toast



class SportSettingUpFragment : Fragment() {

    private val args: SportSettingUpFragmentArgs by navArgs()
    private lateinit var viewModel: SportSettingUpViewModel
    private lateinit var binding:FragmentSportSettingUpBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =SportSettingUpViewModel(args.sportId)
        binding= FragmentSportSettingUpBinding.inflate(inflater, container, false)
        binding.toast.setOnClickListener{
                context?.toast("this is toast")
        }
        binding.alert.setOnClickListener{
            context?.logd("this is timber log")
        }
        return binding.root
    }
}