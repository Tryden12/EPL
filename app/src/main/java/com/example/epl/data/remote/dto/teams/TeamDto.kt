package com.example.epl.data.remote.dto.teams

import com.squareup.moshi.Json

data class TeamDto(
    val data: TeamDtoData
) {
    data class TeamDtoData(
        @field:Json(name = "country_id") val countryId: Int,
        val founded: Int,
        val gender: String,
        val id: Int,
        @field:Json(name = "image_path") val imagePath: String,
        @field:Json(name = "last_played_at") val lastPlayedAt: String,
        val name: String,
        val placeholder: Boolean,
        @field:Json(name = "short_code") val shortCode: String,
        @field:Json(name = "sport_id") val sportId: Int,
        val type: String,
        @field:Json(name = "venue_id") val venueId: Int
    )
}