package com.mysoothe.data

import com.mysoothe.R
import com.mysoothe.data.models.CardItem

object SootheData {

    val favoriteCollections = listOf(
        CardItem(R.drawable.pexels_nothing_ahead_3571551, "Nature meditations"),
        CardItem(R.drawable.pexels_jim_1557238, "Stress and anxiety"),
        CardItem(R.drawable.pexels_scott_webb_1029604, "Self-message"),
        CardItem(R.drawable.pexels_ruvim_3560044, "Overwhelmed"),
        CardItem(R.drawable.pexels_jakub_novacek_924824, "Nightly wind down"),
    )

    val alignYourBody = listOf(
        CardItem(R.drawable.pexels_chevanon_photography_317157, "Inversions"),
        CardItem(R.drawable.pexels_agung_pandit_wiguna_1812964, "Quick yoga"),
        CardItem(R.drawable.pexels_cliff_booth_4056723, "Stretching"),
        CardItem(R.drawable.pexels_elina_fairytale_4662438, "Tabata"),
        CardItem(R.drawable.pexels_the_lazy_artist_gallery_999309, "HIIT"),
        CardItem(R.drawable.pexels_freestocksorg_396133, "Pre-natal yoga")
    )

    val alignYourMind = listOf(
        CardItem(R.drawable.pexels_elina_fairytale_3822622, "Meditate"),
        CardItem(R.drawable.pexels_valeria_ushakova_3094230, "With kids"),
        CardItem(R.drawable.pexels_karolina_grabowska_4498318, "Aromatherapy"),
        CardItem(R.drawable.pexels_suraphat_nueaon_1241348, "On the go"),
        CardItem(R.drawable.pexels_cottonbro_4056535, "With pets"),
        CardItem(R.drawable.pexels_nathan_cowley_897817, "High stress")
    )

    val navItems = listOf(
        BottomNavItem.Home,
        BottomNavItem.Profile
    )
}
