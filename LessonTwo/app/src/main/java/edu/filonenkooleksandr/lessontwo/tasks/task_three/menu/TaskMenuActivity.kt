package edu.filonenkooleksandr.lessontwo.tasks.task_three.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.filonenkooleksandr.lessontwo.R
import edu.filonenkooleksandr.lessontwo.databinding.ActivityTaskMenuBinding
import edu.filonenkooleksandr.lessontwo.tasks.task_three.ImplicitIntentsActivity
import edu.filonenkooleksandr.lessontwo.tasks.task_three.IntentReceiverActivity

class TaskMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTaskMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaskMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.implicitIntent.setOnClickListener {
            startActivity(Intent(this, ImplicitIntentsActivity::class.java))
        }

        binding.intentReceiver.setOnClickListener {
            startActivity(Intent(this, IntentReceiverActivity::class.java))
        }
    }
}