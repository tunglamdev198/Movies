package com.lamnt.tranningrx.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.lamnt.tranningrx.R
import com.lamnt.tranningrx.databinding.ItemMovieBinding
import com.lamnt.tranningrx.model.Movie

class MoviesAdapter(data : List<Movie> ) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {
    private var data : List<Movie> = ArrayList()

    init {
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemMovieBinding = DataBindingUtil.inflate<ItemMovieBinding>(
            LayoutInflater.from(parent.context),R.layout.item_movie,parent,false)
        return ViewHolder(itemMovieBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemMovieBinding.movie = data[position]
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(var itemMovieBinding: ItemMovieBinding)
        : RecyclerView.ViewHolder(itemMovieBinding.root)
}
