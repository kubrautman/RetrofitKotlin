package com.android.kubrautman.retrofitexample.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.kubrautman.retrofitexample.dto.Hero

class HeroesAdapter(heroesList:List<Hero>):RecyclerView.Adapter<HeroesViewHolder>() {

    var heroesList=heroesList
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesViewHolder {
        return HeroesViewHolder(parent)
    }

    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {
        holder.bindTo(heroesList[position])
    }

    override fun getItemCount(): Int {
       return heroesList.size
    }
    fun setHeroList(heroesList: List<Hero>){
        this.heroesList=heroesList
    }
}