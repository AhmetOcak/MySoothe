package com.mysoothe.data

import androidx.annotation.DrawableRes
import com.mysoothe.R
import com.mysoothe.utils.BottomNavItemTexts
import com.mysoothe.utils.NavRoutes

sealed class BottomNavItem(val route: String, val labelText: String, @DrawableRes val icon: Int) {
    object Home :
        BottomNavItem(NavRoutes.homeScreen, BottomNavItemTexts.home, R.drawable.ic_baseline_spa)

    object Profile : BottomNavItem(
        NavRoutes.profileScreen,
        BottomNavItemTexts.profile,
        R.drawable.ic_baseline_account_circle
    )
}
