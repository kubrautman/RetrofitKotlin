package com.android.kubrautman.retrofitexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.kubrautman.retrofitexample.R
import com.android.kubrautman.retrofitexample.dto.Hero
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade

class HeroesViewHolder(viewGroup:ViewGroup):RecyclerView.ViewHolder
(LayoutInflater.from(viewGroup.context).inflate
(R.layout.heroes_list_item,viewGroup,false))
{

    private  val txtName by lazy { itemView.findViewById<TextView>(R.id.txtName) }
   private  val imgViewImage by lazy { itemView.findViewById<ImageView>(R.id.imgViewImageUrl) }
 private  val txtBio by lazy { itemView.findViewById<TextView>(R.id.txtBio) }
 private  val txtRealName by lazy { itemView.findViewById<TextView>(R.id.txtRealName) }
    private  val txtFirstappearence by lazy { itemView.findViewById<TextView>(R.id.txtFirstappearance) }
    fun bindTo(heroDto:Hero){

        txtName.text=heroDto.name
     txtBio.text=heroDto.bio
        txtRealName.text=heroDto.realname
        txtFirstappearence.text=heroDto.firstappearance

     Glide.with(itemView.context).load(heroDto.imageurl)
                .thumbnail(Glide.with(itemView.context).load(R.drawable.abc_ic_go_search_api_material))
                .transition(withCrossFade()).into(imgViewImage)

    }

}