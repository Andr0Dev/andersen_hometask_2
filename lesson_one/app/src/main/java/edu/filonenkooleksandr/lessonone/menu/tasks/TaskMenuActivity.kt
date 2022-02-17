package edu.filonenkooleksandr.lessonone.menu.tasks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import edu.filonenkooleksandr.lessonone.R
import edu.filonenkooleksandr.lessonone.codelab_tasks.task_five.basic_activity.BasicActivity
import edu.filonenkooleksandr.lessonone.codelab_tasks.task_four.TaskFourActivity
import edu.filonenkooleksandr.lessonone.codelab_tasks.task_one.TaskOneActivity
import edu.filonenkooleksandr.lessonone.codelab_tasks.task_three.TaskThreeMenuActivity
import edu.filonenkooleksandr.lessonone.codelab_tasks.task_two.TaskTwoActivity

class TaskMenuActivity : AppCompatActivity() {

    private lateinit var taskOne: Button
    private lateinit var taskTwo: Button
    private lateinit var taskThree: Button
    private lateinit var taskFour: Button
    private lateinit var taskFive: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasks_menu)

        taskOne = findViewById(R.id.task_one)
        taskOne.setOnClickListener {
            startActivity(Intent(this, TaskOneActivity::class.java))
        }

        taskTwo = findViewById(R.id.task_two)
        taskTwo.setOnClickListener {
            startActivity(Intent(this, TaskTwoActivity::class.java))
        }

        taskThree = findViewById(R.id.task_three)
        taskThree.setOnClickListener {
            startActivity(Intent(this, TaskThreeMenuActivity::class.java))
        }

        taskFour = findViewById(R.id.task_four)
        taskFour.setOnClickListener {
            startActivity(Intent(this, TaskFourActivity::class.java))
        }

        taskFive = findViewById(R.id.task_five)
        taskFive.setOnClickListener {
            startActivity(Intent(this, BasicActivity::class.java))
        }
    }
}