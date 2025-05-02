package com.pmtaller2.jonathanherrera_00379823

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import com.pmtaller2.jonathanherrera_00379823.ui.theme.FoodSpotByJherreraTheme
import com.pmtaller2.jonathanherrera_00379823.screens.RestaurantDetailScreen
import com.pmtaller2.jonathanherrera_00379823.screens.MainScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByJherreraTheme {
                FoodSpotApp()
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun FoodSpotApp() {
    val navController = rememberNavController()
    Scaffold(modifier = Modifier.fillMaxSize()) {
        NavHost(navController = navController, startDestination = "home") {
            composable("home") { MainScreen(navController) }
            composable("restaurant/{id}") { backStackEntry ->
                val restaurantId = backStackEntry.arguments?.getString("id")
                RestaurantDetailScreen(restaurantId)
            }
        }
    }
}


