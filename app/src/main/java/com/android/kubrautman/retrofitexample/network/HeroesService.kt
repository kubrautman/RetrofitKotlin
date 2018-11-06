package com.android.kubrautman.retrofitexample.network

import com.android.kubrautman.retrofitexample.dto.Hero
import com.android.kubrautman.retrofitexample.network.response.HeroesResponse
import retrofit2.Call
import retrofit2.http.GET

interface HeroesService {
    @GET("marvel")
    fun getHeroes():Call<List<Hero>>

}