package com.example.epl.data.repository

import com.example.epl.data.mapper.toTeam
import com.example.epl.data.remote.service.TeamsService
import com.example.epl.domain.model.Team
import com.example.epl.domain.repository.TeamsRepository
import com.example.epl.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class TeamsRepositoryImp @Inject constructor(
    private val teamsService: TeamsService
): TeamsRepository {

    override suspend fun getAllTeams(): Flow<Resource<List<Team>>> {

        return flow {
            emit(Resource.Loading(true))

            try {
                val response = teamsService.getAllTeams()

                emit(
                    Resource.Success(
                        buildList {
                            response.data.map {
                                it.toTeam()
                            }
                        }
                    )
                )
            } catch(e: IOException) {
                e.printStackTrace()
                emit(Resource.Error(message = "IOException: Couldn't load team list"))
            } catch(e: retrofit2.HttpException) {
                e.printStackTrace()
                emit(Resource.Error(message = "HttpException: Couldn't load team list"))
            }
        }
    }
}