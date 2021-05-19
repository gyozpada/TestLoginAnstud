package com.sagalang.retrofitlatihan

import android.telecom.Call
import retrofit2.http.GET

interface Api {
    @GET("post")
    fun getPosts(): Call<ArrayList<PostResponse>>
}