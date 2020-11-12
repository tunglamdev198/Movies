package com.lamnt.tranningrx.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.lamnt.tranningrx.repo.MoviesRepository
import javax.inject.Inject

class MovieViewModel @Inject constructor(application: Application,
                                    private val moviesRepository: MoviesRepository)
    : AndroidViewModel(application) {

}