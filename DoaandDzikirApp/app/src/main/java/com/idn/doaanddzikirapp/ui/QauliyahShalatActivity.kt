package com.idn.doaanddzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.idn.doaanddzikirapp.R
import com.idn.doaanddzikirapp.adapter.DzikirDoaAdapter
import com.idn.doaanddzikirapp.model.DataDzikirDoa

class QauliyahShalatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_qauliyah_shalat)

        // # Recyler View
        val rvQauliyah = findViewById<RecyclerView>(R.id.rv_qauliyah_shalat)
        // # layout Manager
        rvQauliyah.layoutManager = LinearLayoutManager(this)
        // # Recyler View Adapter
        rvQauliyah.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)
    }

    // # function: untuk back ke halaman sebelumnya
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}