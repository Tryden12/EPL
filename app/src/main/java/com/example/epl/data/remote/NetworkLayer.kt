package com.example.epl.data.remote

import com.example.epl.data.remote.service.TeamsService
import com.example.epl.util.Constants.BASE_URL
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object NetworkLayer {

    // Converter factory
    val moshi = Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()

    // Retrofit
    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()

    // Services
    val teamsService: TeamsService = retrofit.create(TeamsService::class.java)

    // Api Client
    val apiClient = ApiClient(teamsService)
}
