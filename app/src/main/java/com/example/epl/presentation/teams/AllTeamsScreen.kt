package com.example.epl.presentation.teams

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.ramcosta.composedestinations.annotation.Destination

@Composable
@Destination(start = true)
fun AllTeamsScreen(
    viewModel: TeamsViewModel = hiltViewModel()
) {
    val state = viewModel.state
}