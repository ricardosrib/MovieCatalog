package com.example.moviecatalog

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var dataAdapter: DataAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        initAdapter()
        populateItems()
    }

    private fun initAdapter() {
        dataAdapter = DataAdapter {
            profile -> navigateScreen(profile.link)
        }

        recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = dataAdapter
        }
    }

    private fun populateItems() {
        val dataSource = DataSource.mockUpData()
        dataAdapter.dataSet(dataSource)
    }

    private fun navigateScreen(url: Activity) {
        val intent = Intent(this, url::class.java )
        startActivity(intent)
    }
}