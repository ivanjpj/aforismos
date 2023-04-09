package com.example.aforismos.data

import com.example.aforismos.R
import com.example.aforismos.model.Aforismo

class Datasource {

  fun loadAforismos(): List<Aforismo> {
    return listOf<Aforismo>(
      Aforismo(R.string.affirmation1, R.drawable.image1),
      Aforismo(R.string.affirmation2, R.drawable.image2),
      Aforismo(R.string.affirmation3, R.drawable.image3),
      Aforismo(R.string.affirmation4, R.drawable.image4),
      Aforismo(R.string.affirmation5, R.drawable.image5),
      Aforismo(R.string.affirmation6, R.drawable.image6),
      Aforismo(R.string.affirmation7, R.drawable.image7),
      Aforismo(R.string.affirmation8, R.drawable.image8),
      Aforismo(R.string.affirmation9, R.drawable.image9),
      Aforismo(R.string.affirmation10, R.drawable.image10)
    )
  }

}