package com.example.epl.domain.repository

import com.example.epl.domain.model.Team
import com.example.epl.util.Resource
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface TeamsRepository {

    @GET("teams")
    suspend fun getAllTeams(): Flow<Resource<List<Team>>>
}