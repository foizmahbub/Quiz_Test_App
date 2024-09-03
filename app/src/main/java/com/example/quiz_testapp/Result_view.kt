package com.example.quiz_testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz_testapp.databinding.ActivityResultViewBinding

class Result_view : AppCompatActivity() {
    lateinit var binding: ActivityResultViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityResultViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val skip=intent.getIntExtra("skip",0)
        val correct=intent.getIntExtra("correct",0)
        val wrong=intent.getIntExtra("wrong",0)
        binding.resultTv.text="Total skip :$skip\n"+"Correct Answer :$correct\n"+"Wrong Answer :$wrong"
    }
}