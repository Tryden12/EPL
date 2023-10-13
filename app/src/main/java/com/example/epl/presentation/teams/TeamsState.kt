package com.example.epl.presentation.teams

import com.example.epl.domain.model.Team

data class TeamsState(
    val teamList: List<Team> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)