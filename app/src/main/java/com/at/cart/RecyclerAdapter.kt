package com.at.cart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.layout_row.view.*

class RecyclerAdapter(
    private var productList: ArrayList<Product>,
    private val onItemclickListener: OnItemclickListener,
) :    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.layout_row, parent, false)
        return ViewHolder(view, onItemclickListener)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    class ViewHolder(itemView: View, onItemclickListener: OnItemclickListener) :
        RecyclerView.ViewHolder(itemView) {
        var num = 1

        init {

            itemView.setOnClickListener {
                onItemclickListener.onClick(adapterPosition)
            }
            itemView.setOnLongClickListener {
                onItemclickListener.onLongClick(adapterPosition)
                return@setOnLongClickListener true
            }

            itemView.findViewById<TextView>(R.id.plus).setOnClickListener {
                num++
                var pricetot = 150 * num
                itemView.findViewById<TextView>(R.id.quntaty).setText(num.toString())
                itemView.findViewById<TextView>(R.id.price).setText("\u20B9" +pricetot.toString())
            }

            itemView.findViewById<TextView>(R.id.minus).setOnClickListener {
                if(num == 1){
                    //itemView.findViewById<TextView>(R.id.quntaty).setText("1")
                }else {
                    num--
                    var pricetot = 150 * num
                    itemView.findViewById<TextView>(R.id.price).setText("\u20B9" + pricetot.toString())
                    itemView.findViewById<TextView>(R.id.quntaty).setText(num.toString())
                }
            }

            itemView.findViewById<TextView>(R.id.remove).setOnClickListener {

                    val snack : String = "Removed"
                    Snackbar.make(itemView,snack,Snackbar.LENGTH_LONG).show()

            }
        }

        fun bind(product: Product) {
            itemView.producttitile.text = product.title
            itemView.seeds.text = product.seeds
            itemView.price.text = product.price
            itemView.quntaty.text = product.quntity.toString()
        }

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = productList[position]
        holder.bind(product)
    }

    interface OnItemclickListener {
        fun onClick(position: Int)
        fun onLongClick(position: Int)
    }
}