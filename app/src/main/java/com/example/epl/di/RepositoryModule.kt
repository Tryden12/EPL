package com.example.epl.di

import com.example.epl.data.repository.TeamsRepositoryImp
import com.example.epl.domain.repository.TeamsRepository
import dagger.Binds
import javax.inject.Singleton

abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindTeamsRepository(
        teamsRepositoryImp: TeamsRepositoryImp
    ): TeamsRepository

}