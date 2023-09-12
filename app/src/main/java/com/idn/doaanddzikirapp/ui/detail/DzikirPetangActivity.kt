package com.idn.doaanddzikirapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.idn.doaanddzikirapp.R
import com.idn.doaanddzikirapp.adapter.DzikirDoaAdapter
import com.idn.doaanddzikirapp.model.DataDzikirDoa

class DzikirPetangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_dzikir_petang)

        // # Recyler View
        val rvDzikirPetang = findViewById<RecyclerView>(R.id.rv_dzikir_petang)
        // # layout Manager
        rvDzikirPetang.layoutManager = LinearLayoutManager(this)
        // # Recyler View Adapter
        rvDzikirPetang.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikirPetang )
    }

    // # function: untuk back ke halaman sebelumnya
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}