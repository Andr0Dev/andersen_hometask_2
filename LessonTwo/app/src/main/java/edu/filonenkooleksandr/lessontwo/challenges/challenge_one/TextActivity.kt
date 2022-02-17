package edu.filonenkooleksandr.lessontwo.challenges.challenge_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.filonenkooleksandr.lessontwo.R
import edu.filonenkooleksandr.lessontwo.databinding.ActivityTextBinding

class TextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textChoice = intent.extras?.getInt("text")

        when (textChoice) {
            1 -> binding.textScreen.text = getString(R.string.text_1)
            2 -> binding.textScreen.text = getString(R.string.text_2)
            3 -> binding.textScreen.text = getString(R.string.text_3)
        }

    }
}