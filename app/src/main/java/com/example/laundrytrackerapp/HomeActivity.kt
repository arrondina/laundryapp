package com.example.laundrytrackerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.laundrytrackerapp.fragment.ClothesFragment
import com.example.laundrytrackerapp.fragment.HomeFragment
import com.example.laundrytrackerapp.fragment.OrderFragment
import com.example.laundrytrackerapp.fragment.ProfileFragment
import com.example.laundrytrackerapp.fragment.UploadFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Set the default fragment
        supportFragmentManager.beginTransaction().replace(
            R.id.fragment_container, HomeFragment()
        ).commit()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.nav_order -> {
                    replaceFragment(OrderFragment())
                    true
                }
                R.id.nav_clothes -> {
                    replaceFragment(ClothesFragment())
                    true
                }
                R.id.nav_profile -> {
                    replaceFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }

        val addFab: FloatingActionButton = findViewById(R.id.addFab)
        addFab.setOnClickListener {
            val bottomSheet = UploadFragment()
            bottomSheet.show(supportFragmentManager, "Upload")
        }
    }

    // Utility function to replace fragments
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}