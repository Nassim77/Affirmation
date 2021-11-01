package com.chouknassim.affirmation.data


import com.chouknassim.affirmation.R
import com.chouknassim.affirmation.model.Affirmation1


class Datasource {

    fun loadAffirmations(): List<Affirmation1> {
        return listOf<Affirmation1>(
            Affirmation1(com.chouknassim.affirmation.R.string.affirmation1),
            Affirmation1(R.string.affirmation2),
            Affirmation1(R.string.affirmation3),
            Affirmation1(R.string.affirmation4),
            Affirmation1(R.string.affirmation5),
            Affirmation1(R.string.affirmation6),
            Affirmation1(R.string.affirmation7),
            Affirmation1(R.string.affirmation8),
            Affirmation1(R.string.affirmation9),
            Affirmation1(R.string.affirmation10)
        )
    }
}