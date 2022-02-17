package edu.filonenkooleksandr.lessontwo.challenges.challenge_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.filonenkooleksandr.lessontwo.databinding.ActivityChallengeOneBinding

class ChallengeOneActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChallengeOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChallengeOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textOne.setOnClickListener {
            val textOneIntent = Intent(this, TextActivity::class.java).apply {
                putExtra("text", 1)
            }
            startActivity(textOneIntent)
        }

        binding.textTwo.setOnClickListener {
            val textTwoIntent = Intent(this, TextActivity::class.java).apply {
                putExtra("text", 2)
            }
            startActivity(textTwoIntent)
        }

        binding.textThree.setOnClickListener {
            val textThreeIntent = Intent(this, TextActivity::class.java).apply {
                putExtra("text", 3)
            }
            startActivity(textThreeIntent)
        }
    }
}