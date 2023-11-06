package com.example.projetoriseup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projetoriseup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contactList = listOf(
            Contact(1, "João", "joao@gmail.com", "8199990001"),
            Contact(2, "Amanda", "amanda@gmail.com", "8199990002"),
            Contact(3, "José", "jose@gmail.com", "8199990003"),
            Contact(4, "Cecília", "cecilia@gmail.com", "8199990004"),
        )

        binding.lvContacts
    }
}