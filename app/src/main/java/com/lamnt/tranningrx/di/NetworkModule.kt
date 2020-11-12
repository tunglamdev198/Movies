package com.lamnt.tranningrx.di

import com.lamnt.tranningrx.network.MoviesAPI
import com.lamnt.tranningrx.network.RetrofitClient
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideRetrofit(retrofitClient: RetrofitClient) : Retrofit = retrofitClient.create()

    @Singleton
    @Provides
    fun provideMoviesApi(retrofit: Retrofit) : MoviesAPI = retrofit.create(MoviesAPI::class.java)
}