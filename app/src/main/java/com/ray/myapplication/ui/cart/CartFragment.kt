package com.ray.myapplication.ui.cart

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import androidx.lifecycle.Observer
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ray.myapplication.R
import com.ray.myapplication.ui.home.HomeViewModel

class CartFragment : Fragment() {

    private lateinit var cartViewModel: CartViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cartViewModel =
            ViewModelProviders.of(this).get(cartViewModel::class.java)
        return inflater.inflate(R.layout.cart_fragment, container, false)

    }

}