package com.example.ukl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ukl.databinding.ActivityMain2Binding
import com.example.ukl.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity2 : AppCompatActivity(), NavigationBarView.OnItemSelectedListener,
    View.OnClickListener {
    lateinit var textDikirim: TextView
    lateinit var recycler: RecyclerView
    lateinit var adapter: Adapter
    lateinit var listAdapter: ListAdapter

    lateinit var changeLayout: ImageButton

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textDikirim = findViewById(R.id.dikirim)
        recycler = findViewById(R.id.recycler)
        changeLayout = findViewById(R.id.change_layout)

        changeLayout.setOnClickListener(this)

        val email = intent.getStringExtra("String")
        textDikirim.text = "Dikirim ke " + email

        recycler.layoutManager = GridLayoutManager(this, 2)

        var data = ArrayList<Item>()
        data.addAll(ItemData().listData)

        adapter = Adapter(data)
        listAdapter = ListAdapter(data)
        recycler.adapter = adapter
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home -> {
            }
            R.id.wishlist -> {

            }
            R.id.profile -> {

            }
            else -> {}
        }
        return true
    }

    override fun onClick(p0: View?) {
        if(recycler.adapter == adapter){
            changeLayout.setBackgroundResource(R.drawable.ic_baseline_grid_on_24)
            recycler.adapter = listAdapter
            recycler.layoutManager = LinearLayoutManager(this)
        }
        else if(recycler.adapter == listAdapter){
            changeLayout.setBackgroundResource(R.drawable.ic_baseline_format_list_bulleted_24)
            recycler.adapter = adapter
            recycler.layoutManager = GridLayoutManager(this, 2)
        }
    }
}