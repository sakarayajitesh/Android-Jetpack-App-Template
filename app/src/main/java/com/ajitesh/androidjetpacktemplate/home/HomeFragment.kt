package com.ajitesh.androidjetpacktemplate.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.ajitesh.androidjetpacktemplate.R
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : Fragment() {

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        navigate_bt.setOnClickListener {
            navigateToDetailFragment()
        }
    }

    private fun navigateToDetailFragment(){
        findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment())
    }

}