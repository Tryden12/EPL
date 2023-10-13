package com.example.epl.util

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

fun buildSportMonksApi(): Retrofit {

    return Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(
            Moshi.Builder().addLast(
                KotlinJsonAdapterFactory()
            ).build()
        ))
        .build()
}