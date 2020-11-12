package com.lamnt.tranningrx.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lamnt.tranningrx.R
import com.lamnt.tranningrx.model.Movie
import kotlinx.android.synthetic.main.fragment_list_movie.*

class ListMovieFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_movie, container, false)
        val rvMovie = view.findViewById<RecyclerView>(R.id.rvMovie)
        val data = ArrayList<Movie> ()
        with(rvMovie) {
            layoutManager = GridLayoutManager(activity,2)
            adapter = MoviesAdapter(data)
        }
        return view;
    }


}