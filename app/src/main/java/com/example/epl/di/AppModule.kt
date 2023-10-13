package com.example.epl.di

import com.example.epl.data.remote.service.TeamsService
import com.example.epl.util.buildSportMonksApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTeamsService(): TeamsService {
        return buildSportMonksApi().create()
    }

}