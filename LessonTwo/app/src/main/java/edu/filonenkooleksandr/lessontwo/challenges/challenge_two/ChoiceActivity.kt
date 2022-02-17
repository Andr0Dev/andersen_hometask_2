package edu.filonenkooleksandr.lessontwo.challenges.challenge_two

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.filonenkooleksandr.lessontwo.databinding.ActivityChoiceBinding

class ChoiceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChoiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apple.setOnClickListener {
            val response = Intent(this, ListActivity::class.java).apply {
                putExtra("index", 0)
                putExtra("name", "apple")
            }
            setResult(RESULT_OK, response)
            finish()
        }

        binding.bread.setOnClickListener {
            val response = Intent(this, ListActivity::class.java).apply {
                putExtra("index", 1)
                putExtra("name", "bread")
            }
            setResult(RESULT_OK, response)
            finish()
        }

        binding.cheese.setOnClickListener {
            val response = Intent(this, ListActivity::class.java).apply {
                putExtra("index", 2)
                putExtra("name", "chesse")
            }
            setResult(RESULT_OK, response)
            finish()
        }

        binding.fish.setOnClickListener {
            val response = Intent(this, ListActivity::class.java).apply {
                putExtra("index", 3)
                putExtra("name", "fish")
            }
            setResult(RESULT_OK, response)
            finish()
        }

        binding.juice.setOnClickListener {
            val response = Intent(this, ListActivity::class.java).apply {
                putExtra("index", 4)
                putExtra("name", "juice")
            }
            setResult(RESULT_OK, response)
            finish()
        }

        binding.milk.setOnClickListener {
            val response = Intent(this, ListActivity::class.java).apply {
                putExtra("index", 5)
                putExtra("name", "milk")
            }
            setResult(RESULT_OK, response)
            finish()
        }

        binding.rice.setOnClickListener {
            val response = Intent(this, ListActivity::class.java).apply {
                putExtra("index", 6)
                putExtra("name", "rice")
            }
            setResult(RESULT_OK, response)
            finish()
        }

        binding.sausage.setOnClickListener {
            val response = Intent(this, ListActivity::class.java).apply {
                putExtra("index", 7)
                putExtra("name", "sausage")
            }
            setResult(RESULT_OK, response)
            finish()
        }

        binding.sweets.setOnClickListener {
            val response = Intent(this, ListActivity::class.java).apply {
                putExtra("index", 8)
                putExtra("name", "sweets")
            }
            setResult(RESULT_OK, response)
            finish()
        }

        binding.water.setOnClickListener {
            val response = Intent(this, ListActivity::class.java).apply {
                putExtra("index", 9)
                putExtra("name", "water")
            }
            setResult(RESULT_OK, response)
            finish()
        }
    }
}