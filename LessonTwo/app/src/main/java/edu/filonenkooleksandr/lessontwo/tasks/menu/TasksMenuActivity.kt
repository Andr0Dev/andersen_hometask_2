package edu.filonenkooleksandr.lessontwo.tasks.menu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.filonenkooleksandr.lessontwo.databinding.ActivityTasksMenuBinding
import edu.filonenkooleksandr.lessontwo.tasks.task_one.TaskOneActivity
import edu.filonenkooleksandr.lessontwo.tasks.task_three.menu.TaskMenuActivity
import edu.filonenkooleksandr.lessontwo.tasks.task_two.TaskTwoActivity

class TasksMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTasksMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTasksMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.taskOne.setOnClickListener {
            startActivity(Intent(this, TaskOneActivity::class.java))
        }

        binding.taskTwo.setOnClickListener {
            startActivity(Intent(this, TaskTwoActivity::class.java))
        }

        binding.taskThree.setOnClickListener {
            startActivity(Intent(this, TaskMenuActivity::class.java))
        }
    }
}