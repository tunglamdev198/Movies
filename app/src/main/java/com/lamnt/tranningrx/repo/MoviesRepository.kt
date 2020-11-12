package com.lamnt.tranningrx.repo

import com.lamnt.tranningrx.model.httpresponse.MovieResponse
import io.reactivex.Observable

interface MoviesRepository {
    fun getTopRated(page : Int) : Observable<MovieResponse>
    fun getUpcoming(page : Int): Observable<MovieResponse>
    fun getPopular(page : Int): Observable<MovieResponse>
}