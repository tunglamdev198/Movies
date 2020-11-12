package com.lamnt.tranningrx.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
class AppModule {
    @Singleton
    @Provides
    fun provideContext(application : Application) : Context{
        return application.applicationContext
    }
}