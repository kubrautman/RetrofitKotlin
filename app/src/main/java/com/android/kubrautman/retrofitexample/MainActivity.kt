package com.android.kubrautman.retrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.kubrautman.retrofitexample.adapter.HeroesAdapter
import com.android.kubrautman.retrofitexample.dto.Hero
import com.android.kubrautman.retrofitexample.network.HeroesService
import com.android.kubrautman.retrofitexample.network.RetrofitClient
import com.android.kubrautman.retrofitexample.network.response.HeroesResponse
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView.layoutManager=LinearLayoutManager(this)
        RetrofitClient.getClient().create(HeroesService::class.java).getHeroes().enqueue(object :retrofit2.Callback<List<Hero>>{
            override fun onResponse(call: Call<List<Hero>>, response: Response<List<Hero>>) {
                val herolist=ArrayList(response.body())

                Toast.makeText(this@MainActivity,"Succes",Toast.LENGTH_SHORT).show()
                recyclerView.adapter=HeroesAdapter(herolist)


            }

            override fun onFailure(call: Call<List<Hero>>?, t: Throwable?) {
                Toast.makeText(this@MainActivity,"Failure",Toast.LENGTH_SHORT).show()
            }
        }

        )
}}
