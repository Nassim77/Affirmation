package com.chouknassim.affirmation.model
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation1(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)