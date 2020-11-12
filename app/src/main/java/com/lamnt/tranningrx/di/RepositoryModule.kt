package com.lamnt.tranningrx.di

import com.lamnt.tranningrx.repo.MoviesRepository
import com.lamnt.tranningrx.repo.impl.MoviesRepoImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideMovieRepos(repoImpl: MoviesRepoImpl) : MoviesRepository = repoImpl
}