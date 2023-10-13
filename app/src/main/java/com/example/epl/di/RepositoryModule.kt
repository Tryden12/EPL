package com.example.epl.di

import com.example.epl.data.repository.TeamsRepositoryImp
import com.example.epl.domain.repository.TeamsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindTeamsRepository(
        teamsRepositoryImp: TeamsRepositoryImp
    ): TeamsRepository

}