package com.example.aforismos.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Aforismo(@StringRes val stringResourceId: Int,
                    @DrawableRes val imageResourceId: Int)
