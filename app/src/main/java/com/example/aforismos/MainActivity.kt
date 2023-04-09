package com.example.aforismos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.aforismos.adapter.ItemAdapter
import com.example.aforismos.data.Datasource

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Inicializa la data.
    val myDataset = Datasource().loadAforismos()

    val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
    recyclerView.adapter = ItemAdapter(this, myDataset)

    // Use this setting to improve performance if you know that changes
    // in content do not change the layout size of the RecyclerView
    recyclerView.setHasFixedSize(true)

  }
}