package edu.filonenkooleksandr.lessonone.codelab_tasks.task_three

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import edu.filonenkooleksandr.lessonone.R

class TaskThreeMenuActivity : AppCompatActivity() {

    private lateinit var constraint: Button
    private lateinit var linear: Button
    private lateinit var relative: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_three_menu)

        constraint = findViewById(R.id.constraint_layout)
        constraint.setOnClickListener {
            startActivity(Intent(this, TaskThreeActivity::class.java))
        }

        linear = findViewById(R.id.linear_layout)

        relative = findViewById(R.id.relative_layout)
    }
}