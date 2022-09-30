package com.mysoothe.navigation

import com.mysoothe.utils.NavRoutes

sealed class NavScreen(val route: String) {
    object WelcomeScreen: NavScreen(NavRoutes.welcomeScreen)
    object LoginScreen: NavScreen(NavRoutes.loginScreen)
    object HomeScreen: NavScreen(NavRoutes.homeScreen)
}
