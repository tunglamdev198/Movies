package com.lamnt.tranningrx.repo.impl

import com.lamnt.tranningrx.common.Constant
import com.lamnt.tranningrx.model.httpresponse.MovieResponse
import com.lamnt.tranningrx.network.MoviesAPI
import com.lamnt.tranningrx.repo.MoviesRepository
import io.reactivex.Observable
import javax.inject.Inject

class MoviesRepoImpl @Inject constructor(
    private val moviesAPI: MoviesAPI) : MoviesRepository {
    override fun getTopRated(page: Int): Observable<MovieResponse> {
        return moviesAPI.getTopRated(Constant.API_KEY, Constant.LANGUAGE, 1)
    }

    override fun getUpcoming(page: Int): Observable<MovieResponse> {
        return moviesAPI.getUpcoming(Constant.API_KEY, Constant.LANGUAGE, 1)
    }

    override fun getPopular(page: Int) : Observable<MovieResponse>{
        return moviesAPI.getPopular(Constant.API_KEY, Constant.LANGUAGE, 1)
    }
}