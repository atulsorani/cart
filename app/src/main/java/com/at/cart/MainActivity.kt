package com.at.cart

import android.os.Bundle
import android.provider.Settings.NameValueTable.VALUE
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var productList = arrayListOf<Product>(
            Product("Product Title", "seeds",  getResources().getString(R.string.rs)+"150", 1),
            Product("Product Title", "seeds",  getResources().getString(R.string.rs)+"150", 1),
            Product("Product Title", "seeds",  getResources().getString(R.string.rs)+"150", 1),
            Product("Product Title", "seeds",  getResources().getString(R.string.rs)+"150", 1),
            Product("Product Title", "seeds",  getResources().getString(R.string.rs)+"150", 1),
            Product("Product Title", "seeds",  getResources().getString(R.string.rs)+"150", 1),
            Product("Product Title", "seeds",  getResources().getString(R.string.rs)+"150", 1),
            Product("Product Title", "seeds",  getResources().getString(R.string.rs)+"150", 1),
            Product("Product Title", "seeds",  getResources().getString(R.string.rs)+"150", 1),
            Product("Product Title", "seeds",  getResources().getString(R.string.rs)+"150", 1),
            Product("Product Title", "seeds",  getResources().getString(R.string.rs)+"150", 1),
        )

        var recyclerView1 = findViewById<RecyclerView>(R.id.recyclerView)
        val recyclerAdapter = RecyclerAdapter(productList)
        recyclerView1.adapter = recyclerAdapter
    }

}

