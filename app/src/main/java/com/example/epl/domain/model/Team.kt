package com.example.epl.domain.model

data class Team(
    val name: String,
    val countryId: Int,
    val founded: Int,
    val gender: String,
    val id: Int,
    val imagePath: String,
    val lastPlayedAt: String,
    val placeholder: Boolean,
    val shortCode: String,
    val sportId: Int,
    val type: String,
    val venueId: Int
)
