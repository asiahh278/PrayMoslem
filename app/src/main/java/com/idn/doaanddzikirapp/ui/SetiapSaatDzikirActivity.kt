package com.idn.doaanddzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.idn.doaanddzikirapp.R
import com.idn.doaanddzikirapp.adapter.DzikirDoaAdapter
import com.idn.doaanddzikirapp.model.DataDzikirDoa

class SetiapSaatDzikirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_setiap_saat_dzikir)

        // # Recyler View
        val rvSetiapSaatDzikir = findViewById<RecyclerView>(R.id.rv_dzikir_setiap_saat)
        // # layout manager
        rvSetiapSaatDzikir.layoutManager = LinearLayoutManager(this)
        // # Recyler View Adapter
        rvSetiapSaatDzikir.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)
    }

    // # function: untuk back ke halaman sebelumnya
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}