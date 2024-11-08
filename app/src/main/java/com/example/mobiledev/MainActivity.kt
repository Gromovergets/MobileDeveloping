package com.example.mobiledev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mobiledev.ui.theme.MobileDevTheme
import com.example.mobiledev.ui_components.InfoScreen
import com.example.mobiledev.ui_components.MainScreen
import com.example.mobiledev.utils.ListItem
import com.example.mobiledev.utils.Routes
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            var item: ListItem? = null
            MobileDevTheme {
                NavHost(
                    navController = navController,
                    startDestination = Routes.MAIN_SCREEN
                ){
                    composable(Routes.MAIN_SCREEN){
                        MainScreen{ listItem ->
                            item = listItem
                            navController.navigate(Routes.INFO_SCREEN)
                        }
                    }
                    composable(Routes.INFO_SCREEN){
                        InfoScreen(item = item!!)
                        }
                    }
                }
            }
        }
    }



