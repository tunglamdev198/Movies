package com.lamnt.tranningrx.network

import android.content.Context
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.lamnt.tranningrx.common.Constant
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class RetrofitClient @Inject constructor(context: Context){
    fun create() : Retrofit{
        return  Retrofit.Builder()
            .baseUrl(Constant.MOVIES_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            //.client(client)
            .build()
    }
}