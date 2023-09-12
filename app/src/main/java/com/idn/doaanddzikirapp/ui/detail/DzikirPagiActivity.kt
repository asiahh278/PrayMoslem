package com.idn.doaanddzikirapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.idn.doaanddzikirapp.R
import com.idn.doaanddzikirapp.adapter.DzikirDoaAdapter
import com.idn.doaanddzikirapp.model.DataDzikirDoa

class DzikirPagiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_dzikir_pagi)

        val rvDzikirPagi = findViewById<RecyclerView>(R.id.rv_dzikir_pagi)
        // # layout Manager
        rvDzikirPagi.layoutManager = LinearLayoutManager(this)
        // # Recyler View Adapter
        rvDzikirPagi.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikirPagi )
    }

    // # function: untuk back ke halaman sebelumnya
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}