package com.example.madpractical11_21012022009

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.example.madpractical11_21012022009.databinding.ActivityNoteViewBinding


class NoteViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNoteViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)
        note = intent.getSerializableExtra("object")as Note
        binding = ActivityNoteViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setActionBar(binding.toolbar)
        with(note){
            binding.noteTitel
        }

    }
}