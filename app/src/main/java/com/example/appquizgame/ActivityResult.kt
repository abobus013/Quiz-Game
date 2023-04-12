package com.example.appquizgame

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appquizgame.databinding.ActivityResultBinding
import com.example.quizgame.QuestionList

class ActivityResult : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val count = intent.getIntExtra("rightCount", 0)
        val name = intent.getStringExtra("name")
        binding.tvName.text =
            "$name"
        binding.textResult.text =
            "$count / ${QuestionList.getQuestions().size}"

        binding.materialButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}