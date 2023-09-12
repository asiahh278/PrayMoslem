package com.idn.doaanddzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.idn.doaanddzikirapp.R
import com.idn.doaanddzikirapp.adapter.DzikirDoaAdapter
import com.idn.doaanddzikirapp.model.DzikirDoa

class HarianDzikirDoaActivity : AppCompatActivity() {
    private val listDzikir: ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_harian_dzikir_doa)

        initData()

        // # Recycler View
        val rvDzikirDoaHarian = findViewById<RecyclerView>(R.id.rv_dzikir_doa_harian)
        // # layout Manager
        rvDzikirDoaHarian.layoutManager = LinearLayoutManager(this)
        // # Recycler View Adapter
        rvDzikirDoaHarian.adapter = DzikirDoaAdapter(listDzikir)
    }

    private fun initData() {
        val desc = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafaz = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        for (data in desc.indices){
            val dzikir = DzikirDoa(
                desc[data],
                lafaz[data],
                terjemah[data]
            )
            listDzikir.add(dzikir)
        }
    }

    // # function: untuk back ke halaman sebelumnya
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}