package com.pmtaller2.jonathanherrera_00379823.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.pmtaller2.jonathanherrera_00379823.models.restaurants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController) {
    val groupedRestaurants = restaurants.groupBy { it.categories.first() }

    Scaffold(
        topBar = { TopAppBar(title = { Text("FoodSpot") }) }
    ) { innerPadding ->
        LazyColumn(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
            groupedRestaurants.forEach { (category, restaurantList) ->
                item {
                    Text(
                        text = category,
                        style = MaterialTheme.typography.headlineMedium,
                        modifier = Modifier.padding(16.dp)
                    )
                }
                item {
                    LazyRow(modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)) {
                        items(restaurantList) { restaurant ->
                            RestaurantCard(navController, restaurant)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun RestaurantCard(navController: NavController, restaurant: com.pmtaller2.jonathanherrera_00379823.models.Restaurant) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .width(200.dp)
            .clickable { navController.navigate("restaurant/${restaurant.id}") }
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Image(
                painter = rememberAsyncImagePainter(restaurant.imageUrl),
                contentDescription = restaurant.name,
                modifier = Modifier.height(120.dp).fillMaxWidth()
            )
            Text(
                text = restaurant.name,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}
