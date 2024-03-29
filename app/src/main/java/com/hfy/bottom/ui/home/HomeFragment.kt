package com.hfy.bottom.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.BounceInterpolator
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hfy.bottom.R
import com.hfy.bottom.ui.home.build.BuildFragment
import com.hfy.bottom.ui.home.index.IndexFragment
import com.hfy.bottom.ui.home.setting.SettingFragment
import com.lauzy.freedom.lbehaviorlib.behavior.CommonBehavior

class HomeFragment : Fragment() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                val fragment = IndexFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_build -> {
                val fragment = BuildFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_setting -> {
                val fragment = SettingFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val bottomView: BottomNavigationView = root.findViewById(R.id.bottom_navigation)
        bottomView.setOnNavigationItemSelectedListener (mOnNavigationItemSelectedListener)

        val mBottomBehavior = CommonBehavior.from(bottomView)
        mBottomBehavior.setMinScrollY(20)
        mBottomBehavior.setScrollYDistance(100)
        mBottomBehavior.setDuration(1000)
        mBottomBehavior.setInterpolator(BounceInterpolator())


        val fragment = BuildFragment()
        addFragment(fragment)
        bottomView.selectedItemId=R.id.navigation_build//确保启动切换到该页

        return root
    }

    @SuppressLint("PrivateResource")
    private fun addFragment(fragment: Fragment) {
        childFragmentManager.beginTransaction()
            .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.root_content, fragment, fragment.javaClass.simpleName)
            .commit()
    }
}