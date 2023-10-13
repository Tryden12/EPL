package com.example.epl.data.mapper

import com.example.epl.data.remote.dto.teams.TeamDto
import com.example.epl.domain.model.Team

fun TeamDto.TeamDtoData.toTeam(): Team {
    return Team(
        name = name,
        countryId = countryId,
        founded = founded,
        gender = gender,
        id = id,
        imagePath = imagePath,
        lastPlayedAt = lastPlayedAt,
        placeholder = placeholder,
        shortCode = shortCode,
        sportId = sportId,
        type = type,
        venueId = venueId
    )
}
