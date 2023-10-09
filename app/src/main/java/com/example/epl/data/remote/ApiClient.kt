package com.example.epl.data.remote

import com.example.epl.data.remote.dto.teams.TeamsDto
import com.example.epl.data.remote.service.TeamsService
import retrofit2.Response

class ApiClient(
    private val teamsService: TeamsService
) {

    // region safeApiCall
    private inline fun <T> safeApiCall(apiCall: () -> Response<T>): ResponseResource<T> {
        return try {
            ResponseResource.success(apiCall.invoke())
        } catch (e: Exception) {
            ResponseResource.failure(e)
        }
    }
    // endregion safeApiCall

    // region teams
    suspend fun getAllTeams() : ResponseResource<TeamsDto> {
        return safeApiCall { teamsService.getAllTeams() }
    }
    // endregion teams

}