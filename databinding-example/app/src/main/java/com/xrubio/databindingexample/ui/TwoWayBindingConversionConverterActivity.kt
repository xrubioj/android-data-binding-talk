package com.xrubio.databindingexample.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.xrubio.databindingexample.R
import com.xrubio.databindingexample.databinding.ActivityTwoWayBindingConversionConverterBinding
import com.xrubio.databindingexample.model.TwoWayDataBindingConversionModel

class TwoWayBindingConversionConverterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTwoWayBindingConversionConverterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_binding_conversion_converter)

        binding.model = TwoWayDataBindingConversionModel(-1)
        binding.view = this
    }

    fun onButtonClick(btn: View, value: Int) {
        Toast.makeText(this, "Value is ${if (value >= 0) value else "empty"}", Toast.LENGTH_LONG)
                .show()
    }

}