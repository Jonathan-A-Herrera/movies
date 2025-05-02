package com.pmtaller2.jonathanherrera_00379823.models

val restaurants = listOf(
    // 🔥 Categoría: Carnes / Parrilla / Familiar
    Restaurant(
        id = 1,
        name = "La Parrilla Alegre",
        description = "Un lugar acogedor con las mejores carnes asadas de la ciudad.",
        imageUrl = "", // 🔗 Agrega la URL aquí
        categories = listOf("Carnes", "Parrilla", "Familiar"),
        menu = listOf(
            Dish(id = 101, name = "Churrasco Especial", description = "Carne de res jugosa con acompañamientos.", imageUrl = ""),
            Dish(id = 102, name = "Pollo a la Parrilla", description = "Pollo marinado con especias locales.", imageUrl = ""),
            Dish(id = 103, name = "Chorizo Artesanal", description = "Chorizo casero a la parrilla.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 4,
        name = "El Asador Tradicional",
        description = "Las mejores carnes con técnicas tradicionales.",
        imageUrl = "",
        categories = listOf("Carnes", "Parrilla"),
        menu = listOf(
            Dish(id = 104, name = "Costillas BBQ", description = "Costillas de cerdo con salsa BBQ.", imageUrl = ""),
            Dish(id = 105, name = "Entrecot Premium", description = "Corte de res con especias selectas.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 5,
        name = "Brasa y Sazón",
        description = "Parrilladas y cortes al estilo argentino.",
        imageUrl = "",
        categories = listOf("Carnes", "Parrilla"),
        menu = listOf(
            Dish(id = 106, name = "Bife de Chorizo", description = "Corte grueso de carne jugosa.", imageUrl = ""),
            Dish(id = 107, name = "Morcilla Criolla", description = "Morcilla artesanal a la parrilla.", imageUrl = "")
        )
    ),

    // 🌮 Categoría: Comida Casera / Económica / Reconfortante
    Restaurant(
        id = 2,
        name = "Sazón de la Abuela",
        description = "Comida casera que te hará sentir como en casa.",
        imageUrl = "",
        categories = listOf("Comida Casera", "Económico", "Reconfortante"),
        menu = listOf(
            Dish(id = 201, name = "Sopa de Gallina", description = "Gallina campera con vegetales frescos.", imageUrl = ""),
            Dish(id = 202, name = "Tamales de Elote", description = "Tamales dulces tradicionales.", imageUrl = ""),
            Dish(id = 203, name = "Pastelitos de Carne", description = "Pasteles rellenos con carne y especias.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 6,
        name = "El Fogón Familiar",
        description = "Recetas caseras con sazón auténtico.",
        imageUrl = "",
        categories = listOf("Comida Casera", "Reconfortante"),
        menu = listOf(
            Dish(id = 204, name = "Frijoles de la Casa", description = "Frijoles con chicharrón y plátanos.", imageUrl = ""),
            Dish(id = 205, name = "Guiso de Res", description = "Carne de res con papas y zanahoria.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 7,
        name = "Cocina Artesanal",
        description = "Platos tradicionales con ingredientes frescos.",
        imageUrl = "",
        categories = listOf("Comida Casera"),
        menu = listOf(
            Dish(id = 206, name = "Arroz con Pollo", description = "Receta clásica con especias naturales.", imageUrl = ""),
            Dish(id = 207, name = "Caldo de Res", description = "Sopa nutritiva con verduras frescas.", imageUrl = "")
        )
    ),

    // 🦐 Categoría: Mariscos / Gourmet / Romántico
    Restaurant(
        id = 3,
        name = "Delicias del Mar",
        description = "Especialidades en mariscos frescos y sabores costeros.",
        imageUrl = "",
        categories = listOf("Mariscos", "Romántico", "Gourmet"),
        menu = listOf(
            Dish(id = 301, name = "Camarones al Ajillo", description = "Camarones salteados con ajo y perejil.", imageUrl = ""),
            Dish(id = 302, name = "Pescado Frito", description = "Pescado fresco servido con arroz y ensalada.", imageUrl = ""),
            Dish(id = 303, name = "Ceviche Mixto", description = "Ceviche de pescado y mariscos.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 8,
        name = "Mariscos Gourmet",
        description = "Experiencia premium en comida de mar.",
        imageUrl = "",
        categories = listOf("Mariscos", "Gourmet"),
        menu = listOf(
            Dish(id = 304, name = "Langosta al Ajillo", description = "Langosta con mantequilla y ajo.", imageUrl = ""),
            Dish(id = 305, name = "Pulpo a la Gallega", description = "Pulpo con papas y pimentón.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 9,
        name = "Sabores del Puerto",
        description = "Recetas frescas inspiradas en la costa.",
        imageUrl = "",
        categories = listOf("Mariscos", "Romántico"),
        menu = listOf(
            Dish(id = 306, name = "Filete de Pescado", description = "Pescado blanco con limón y hierbas.", imageUrl = ""),
            Dish(id = 307, name = "Mejillones al Vino", description = "Mejillones en salsa de vino blanco.", imageUrl = "")
        )
    )
)
