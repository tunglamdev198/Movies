package com.lamnt.tranningrx.model.httpresponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.lamnt.tranningrx.model.Movie

data class MovieResponse(@SerializedName("page") @Expose val page : Int,
                         @SerializedName("results") @Expose val movies : List<Movie>,
                         @SerializedName("total_results") @Expose val totalResults : Int,
                         @SerializedName("total_pages") @Expose val totalPages : Int) {
}