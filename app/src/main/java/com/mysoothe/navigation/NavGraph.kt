package com.mysoothe.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.mysoothe.R
import com.mysoothe.components.CustomScaffold
import com.mysoothe.data.SootheData
import com.mysoothe.screens.HomeScreen
import com.mysoothe.screens.LoginScreen
import com.mysoothe.screens.WelcomeScreen

@Composable
fun NavGraph(startDestination: String = NavScreen.WelcomeScreen.route) {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    var showFab by rememberSaveable { mutableStateOf(false) }

    CustomScaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            SootheData.navItems.forEach { navItem ->
                if (navItem.route == currentRoute) {

                    showFab = true

                    BottomAppBar(
                        modifier = Modifier.navigationBarsPadding(),
                        elevation = 8.dp,
                        backgroundColor = MaterialTheme.colors.background,
                    ) {
                        SootheData.navItems.forEach { screen ->
                            BottomNavigationItem(
                                selected = currentRoute == screen.route,
                                onClick = {
                                    if (currentRoute == screen.route) {
                                        return@BottomNavigationItem
                                    }

                                    if (currentRoute != screen.route) {
                                        navController.navigate(screen.route) {
                                            NavScreen.HomeScreen.route.let {
                                                popUpTo(navController.graph.findStartDestination().id) {
                                                    saveState = true
                                                }
                                                launchSingleTop = true
                                                restoreState = true
                                            }
                                        }
                                    }
                                },
                                icon = {
                                    Icon(
                                        modifier = Modifier.size(18.dp),
                                        painter = painterResource(id = screen.icon),
                                        contentDescription = null
                                    )
                                },
                                label = {
                                    Text(
                                        text = screen.labelText,
                                        style = MaterialTheme.typography.caption,
                                        color = MaterialTheme.colors.onBackground,
                                    )
                                }
                            )
                        }
                    }
                }
            }
        },
        content = {
            NavHost(
                modifier = Modifier.padding(it),
                navController = navController,
                startDestination = startDestination
            ) {
                composable(NavScreen.WelcomeScreen.route) { WelcomeScreen() }
                composable(NavScreen.LoginScreen.route) { LoginScreen() }
                composable(NavScreen.HomeScreen.route) { HomeScreen() }
            }
        },
        floatingActionButton = {
            if (showFab) {
                FloatingActionButton(
                    onClick = { /*TODO*/ },
                    backgroundColor = MaterialTheme.colors.primary,
                ) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.ic_baseline_play_arrow),
                        contentDescription = null,
                    )
                }
            }
        }
    )
}