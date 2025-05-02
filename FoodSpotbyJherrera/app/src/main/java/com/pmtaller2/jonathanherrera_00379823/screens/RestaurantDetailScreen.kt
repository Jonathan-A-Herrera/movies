package com.pmtaller2.jonathanherrera_00379823.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.pmtaller2.jonathanherrera_00379823.models.restaurants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantDetailScreen(restaurantId: String?) {
    val restaurant = restaurants.find { it.id.toString() == restaurantId }
    Scaffold(
        topBar = { TopAppBar(title = { Text(restaurant?.name ?: "Restaurante") }) }
    ) { innerPadding ->
        if (restaurant != null) {
            LazyColumn(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
                items(restaurant.menu) { dish ->
                    Card(modifier = Modifier.padding(8.dp)) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                painter = rememberAsyncImagePainter(dish.imageUrl),
                                contentDescription = dish.name,
                                modifier = Modifier.fillMaxWidth().height(120.dp)
                            )
                            Text(text = dish.name, style = MaterialTheme.typography.titleMedium)
                            Text(text = dish.description, style = MaterialTheme.typography.bodySmall)
                        }
                    }
                }
            }
        } else {
            Text(text = "Restaurante no encontrado", modifier = Modifier.padding(16.dp))
        }
    }
}