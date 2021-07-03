package com.dyinlabz.aboutme

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.dyinlabz.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun addNickName(){
            binding.nicknameText.visibility = View.GONE
            val name = binding.editNickname.text.toString()
            binding.nicknameText.text = name
            binding.nicknameText.visibility = View.VISIBLE
        }


        binding.doneButton.setOnClickListener {
            addNickName()
        }
    }
}