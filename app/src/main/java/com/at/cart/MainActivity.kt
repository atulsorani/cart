package com.at.cart

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), RecyclerAdapter.OnItemclickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var productList = arrayListOf<Product>(
            Product("Product Title", "seeds", getResources().getString(R.string.rs) + "150", 1),
            Product("Product Title", "seeds", getResources().getString(R.string.rs) + "150", 1),
            Product("Product Title", "seeds", getResources().getString(R.string.rs) + "150", 1),
            Product("Product Title", "seeds", getResources().getString(R.string.rs) + "150", 1),
            Product("Product Title", "seeds", getResources().getString(R.string.rs) + "150", 1),
            Product("Product Title", "seeds", getResources().getString(R.string.rs) + "150", 1),
            Product("Product Title", "seeds", getResources().getString(R.string.rs) + "150", 1),
            Product("Product Title", "seeds", getResources().getString(R.string.rs) + "150", 1),
            Product("Product Title", "seeds", getResources().getString(R.string.rs) + "150", 1),
            Product("Product Title", "seeds", getResources().getString(R.string.rs) + "150", 1),
            Product("Product Title", "seeds", getResources().getString(R.string.rs) + "150", 1),
        )

        var recyclerView1 = findViewById<RecyclerView>(R.id.recyclerView)
        val recyclerAdapter = RecyclerAdapter(productList, this)
        recyclerView1.adapter = recyclerAdapter
    }

    override fun onClick(position: Int) {
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
    }

    override fun onLongClick(position: Int) {
        Toast.makeText(this, "Long Click", Toast.LENGTH_SHORT).show()
    }

}

