package com.example.kotlininstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.replace
import com.example.kotlininstagram.Fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    private val onNavigationSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {item->
        when(item.itemId){
            R.id.nav_home -> {
                selectFragment(HomeFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_profile -> {
                selectFragment(ProfileFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_addPost -> {
                selectFragment(AddPostFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_notifications -> {
                selectFragment(NotificationFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_seach -> {
                selectFragment(SearchFragment())
                return@OnNavigationItemSelectedListener true
            }

        }

        false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener(onNavigationSelectedListener)

        selectFragment(HomeFragment())

    }


    private fun selectFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.main_frameLayout, fragment).commit()
    }


}
