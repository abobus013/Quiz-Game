package com.example.appquizgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appquizgame.databinding.ActivityMainBinding
import com.example.quizgame.ActivityQuestions

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.buttonStart.setOnClickListener {
            val name = binding.outlinedTextField.text.toString()
            if (name.isEmpty()) {
                Toast.makeText(this, "Enter Your Name", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this, ActivityQuestions::class.java)
                intent.putExtra("name",name)
                startActivity(intent)
                finish()
            }
        }

    }
}