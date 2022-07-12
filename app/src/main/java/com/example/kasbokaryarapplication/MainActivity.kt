package com.example.kasbokaryarapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.kasbokaryarapplication.ui.ContactFragment
import com.example.kasbokaryarapplication.ui.EducationFragment
import com.example.kasbokaryarapplication.ui.HomeFragment
import com.example.kasbokaryarapplication.ui.ServiceFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigation = findViewById<BottomNavigationView>(R.id.navigation)

        val homeFragment = HomeFragment()
        val serviceFragment = ServiceFragment()
        val educationFragment = EducationFragment()
        val contactFragment = ContactFragment()

        navigation.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.action_main -> setCurrentFragment(homeFragment)
                R.id.action_services -> setCurrentFragment(serviceFragment)
                R.id.action_education -> setCurrentFragment(educationFragment)
                R.id.action_contact -> setCurrentFragment(contactFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.nav_host_fragment,fragment)
            commit()
        }
}