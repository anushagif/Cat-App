package com.anusha.cat_info.api

import retrofit2.Response
import retrofit2.http.GET

interface CatApi {

    @GET("/search?limit=10")
    suspend fun getCats():Response<List<CatResponse>>
}