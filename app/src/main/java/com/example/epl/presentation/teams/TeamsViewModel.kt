package com.example.epl.presentation.teams


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.epl.domain.repository.TeamsRepository
import com.example.epl.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class TeamsViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val repository: TeamsRepository
): ViewModel() {

    var state by mutableStateOf(TeamsState())

    init {
        getAllTeams()
    }

    private fun getAllTeams() {
        viewModelScope.launch {
            repository
                .getAllTeams()
                .collect { result ->
                    when (result) {
                        is Resource.Success -> {
                            result.data?.let { teamList ->
                                state = state.copy(
                                    teamList = teamList
                                )
                            }
                        }
                        is Resource.Error -> Unit
                        is Resource.Loading -> {
                            state = state.copy(isLoading = result.isLoading)
                        }
                    }
                }
        }
    }

}