package edu.filonenkooleksandr.lessontwo.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.filonenkooleksandr.lessontwo.challenges.menu.ChallengesMenuActivity
import edu.filonenkooleksandr.lessontwo.databinding.ActivityMainBinding
import edu.filonenkooleksandr.lessontwo.homeworks.menu.HomeworkMenuActivity
import edu.filonenkooleksandr.lessontwo.tasks.menu.TasksMenuActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tasks.setOnClickListener {
            startActivity(Intent(this, TasksMenuActivity::class.java))
        }

        binding.homeworks.setOnClickListener {
            startActivity(Intent(this, HomeworkMenuActivity::class.java))
        }

        binding.challenges.setOnClickListener {
            startActivity(Intent(this, ChallengesMenuActivity::class.java))
        }
    }
}