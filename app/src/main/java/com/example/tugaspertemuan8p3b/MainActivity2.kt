package com.example.tugaspertemuan8p3b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.tugaspertemuan8p3b.databinding.ActivityMain2Binding
import com.example.tugaspertemuan8p3b.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMain2Binding.inflate(layoutInflater)
        title="Dashboard"
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.logout, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_logout -> {
                supportFragmentManager.beginTransaction().replace(R.id.activity_main, RegisterFragment())
                    .addToBackStack(null).commit()
                Toast.makeText(this, "Logout Berhasil", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}