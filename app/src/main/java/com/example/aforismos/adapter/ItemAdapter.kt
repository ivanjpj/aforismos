package com.example.aforismos.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aforismos.R
import com.example.aforismos.model.Aforismo

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */
class ItemAdapter(
  private val context: Context,
  private val dataset: List<Aforismo>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

  class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
      val textView: TextView = view.findViewById(R.id.item_title)
      val imageView: ImageView = view.findViewById(R.id.item_image)
  }

  /**
   * Crea nuevas vistas
   */
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
    //crea una nueva vista
    val adapterLayout = LayoutInflater.from(parent.context)
      .inflate(R.layout.list_item, parent, false)

    return ItemViewHolder(adapterLayout)
  }

  /**
   * Retorna el tamaño del dataset (invocado por el layout manager)
   */
  override fun getItemCount() = dataset.size

  /**
   * Remplaza el contenido de una vista
   */
  override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
    val item = dataset[position]
    holder.textView.text = context.resources.getString(item.stringResourceId)
    holder.imageView.setImageResource(item.imageResourceId)
  }

}