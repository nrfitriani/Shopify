package com.dicoding.picodiploma.shopify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.picodiploma.shopify.model.Item
import com.dicoding.picodiploma.shopify.model.ItemData

class MainActivity : AppCompatActivity() {
    private lateinit var rvItem: RecyclerView
    private var list: ArrayList<Item> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar!!.title = "Shopify"

        rvItem = findViewById(R.id.rv_Item)
        rvItem.setHasFixedSize(true)

        list.addAll(ItemData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvItem.layoutManager = LinearLayoutManager(this)
        val listItemAdapter= ListItemAdapter(list)
        rvItem.adapter = listItemAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?) : Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.creator_about -> {
                val meAbout = Intent(this@MainActivity, About::class.java)
                startActivity(meAbout)
            }
        }
    }
}
