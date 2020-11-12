package com.lamnt.tranningrx.network

import com.lamnt.tranningrx.model.httpresponse.MovieResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesAPI {
    @GET("/upcoming/")
    fun getUpcoming(@Query("api_key") apiKey : String,
                    @Query("language") language : String,
                    @Query("page") page : Int) : Observable<MovieResponse>

    @GET("/top_rated/")
    fun getTopRated(@Query("api_key") apiKey : String,
                    @Query("language") language : String,
                    @Query("page") page : Int) : Observable<MovieResponse>

    @GET("/popular/")
    fun getPopular(@Query("api_key") apiKey : String,
                    @Query("language") language : String,
                    @Query("page") page : Int) : Observable<MovieResponse>
}