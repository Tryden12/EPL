package com.example.epl.data.remote.service

import com.example.epl.data.remote.dto.teams.TeamsDto
import com.example.epl.util.Constants.API_TOKEN
import retrofit2.http.GET
import retrofit2.http.Query

interface TeamsService {

    @GET("teams")
    suspend fun getAllTeams(
        @Query("api_token") apiToken: String = API_TOKEN
    ): TeamsDto

}