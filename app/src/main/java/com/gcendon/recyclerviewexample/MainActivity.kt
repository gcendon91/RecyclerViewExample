package com.gcendon.recyclerviewexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.gcendon.recyclerviewexample.adapter.SuperHeroAdapter
import com.gcendon.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val manager =  LinearLayoutManager(this)
        binding.rvSuperHero.layoutManager = manager
        binding.rvSuperHero.adapter =
            SuperHeroAdapter(SuperHeroProvider.superHeroList) { superHero ->
                onItemSelected(
                    superHero
                )
            }
    }

    fun onItemSelected(superHero: SuperHero) {
        Toast.makeText(this, superHero.superhero, Toast.LENGTH_SHORT).show()
    }
}
