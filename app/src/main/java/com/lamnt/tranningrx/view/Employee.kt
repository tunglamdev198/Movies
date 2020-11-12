package com.lamnt.tranningrx.view

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.gson.annotations.SerializedName

class Employee {
    @SerializedName("avatar")
    var avatar: String? = null

    @SerializedName("email")
    var email: String? = null

    @SerializedName("first_name")
    var firstName: String? = null

    @SerializedName("id")
    var id: Long? = null

    @SerializedName("last_name")
    var lastName: String? = null

    companion object {
        // important code for loading image here
        @BindingAdapter("avatar")
        fun loadImage(imageView: ImageView, imageURL: String?) {
            Glide.with(imageView.context)
                .setDefaultRequestOptions(
                    RequestOptions()
                        .circleCrop()
                )
                .load(imageURL)
                .into(imageView)
        }
    }
}