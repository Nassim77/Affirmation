package com.chouknassim.affirmation.data


import com.chouknassim.affirmation.R
import com.chouknassim.affirmation.model.Affirmation1


class Datasource {

    fun loadAffirmations(): List<Affirmation1> {
        return listOf<Affirmation1>(
            Affirmation1(R.string.affirmation1, R.drawable.image1),
            Affirmation1(R.string.affirmation2, R.drawable.image2),
            Affirmation1(R.string.affirmation3, R.drawable.image3),
            Affirmation1(R.string.affirmation4, R.drawable.image4),
            Affirmation1(R.string.affirmation5, R.drawable.image5),
            Affirmation1(R.string.affirmation6, R.drawable.image6),
            Affirmation1(R.string.affirmation7, R.drawable.image7),
            Affirmation1(R.string.affirmation8, R.drawable.image8),
            Affirmation1(R.string.affirmation9, R.drawable.image9),
            Affirmation1(R.string.affirmation10, R.drawable.image10)
        )
    }
}
