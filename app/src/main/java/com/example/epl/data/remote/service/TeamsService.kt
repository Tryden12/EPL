package com.example.epl.data.remote.service

import com.example.epl.data.remote.dto.teams.TeamsDto
import retrofit2.Response
import retrofit2.http.GET

interface TeamsService {

    @GET("teams")
    suspend fun getAllTeams(): Response<TeamsDto>

}