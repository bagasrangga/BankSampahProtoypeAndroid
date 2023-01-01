package com.example.banksampah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import com.example.banksampah.databinding.ActivityFormTransaksiBinding
import com.example.banksampah.databinding.ActivityMainBinding

class FormTransaksi : AppCompatActivity() {

    private lateinit var binding: ActivityFormTransaksiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormTransaksiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = listOf("Plastik", "Kertas / Karton", "Kaca", "Alumunium")
        val adapter = ArrayAdapter(this, R.layout.list_sampah, items)
        binding.dropdownField.setAdapter(adapter)
    }
}