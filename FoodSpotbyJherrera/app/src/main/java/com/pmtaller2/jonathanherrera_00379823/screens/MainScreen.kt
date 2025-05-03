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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import restaurants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController) {
    val categoriasPrincipales = listOf(
        "Comida Rapida",
        "Comida Mexicana",
        "Comida Italiana",
        "Comida Asiatica",
        "Comida Saludable",
        "Postres y Dulces",
        "Bebidas"
    )

    val categoryMap = categoriasPrincipales.associateWith { categoria ->
        restaurants.filter { it.categories.contains(categoria) }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("FoodSpot", color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF1976D2))
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(12.dp)
        ) {
            categoryMap.forEach { (category, restaurantsInCategory) ->
                if (restaurantsInCategory.isNotEmpty()) {
                    item {
                        Text(
                            text = category,
                            style = MaterialTheme.typography.titleLarge.copy(
                                color = Color(0xFF0D47A1),
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(vertical = 8.dp)
                        )
                    }

                    item {
                        LazyRow(
                            contentPadding = PaddingValues(horizontal = 4.dp),
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            items(restaurantsInCategory) { restaurant ->
                                Card(
                                    modifier = Modifier
                                        .width(250.dp)
                                        .clickable {
                                            navController.navigate("restaurant/${restaurant.id}")
                                        },
                                    colors = CardDefaults.cardColors(containerColor = Color(0xFFE3F2FD)),
                                    elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                                    shape = RoundedCornerShape(16.dp)
                                ) {
                                    Column {
                                        Image(
                                            painter = rememberAsyncImagePainter(restaurant.imageUrl),
                                            contentDescription = restaurant.name,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .height(140.dp)
                                                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                                        )
                                        Column(modifier = Modifier.padding(12.dp)) {
                                            Text(
                                                text = restaurant.name,
                                                style = MaterialTheme.typography.titleMedium.copy(
                                                    color = Color(0xFF1565C0),
                                                    fontWeight = FontWeight.Bold
                                                )
                                            )
                                            Text(
                                                text = restaurant.description,
                                                style = MaterialTheme.typography.bodySmall.copy(color = Color(0xFF1E88E5)),
                                                fontSize = 13.sp
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}