package com.lamnt.tranningrx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lamnt.tranningrx.view.ListMovieFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.mnuUpcoming,
                R.id.mnuTopRate,
                R.id.mnuPopular,
                R.id.mnuNowPlaying->{
                    supportFragmentManager.beginTransaction().replace(R.id.container,ListMovieFragment()).commit()
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
        bottomNav.selectedItemId = R.id.mnuUpcoming
    }
}