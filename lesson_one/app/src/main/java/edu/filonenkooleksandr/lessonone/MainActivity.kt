package edu.filonenkooleksandr.lessonone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import edu.filonenkooleksandr.lessonone.menu.challenges.ChallengesMenuActivity
import edu.filonenkooleksandr.lessonone.menu.homeworks.HomeworkMenuActivity
import edu.filonenkooleksandr.lessonone.menu.tasks.TaskMenuActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btn_tasks: Button
    private lateinit var btn_challenges: Button
    private lateinit var btn_homeworks: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_tasks = findViewById(R.id.tasks)
        btn_challenges = findViewById(R.id.challenges)
        btn_homeworks = findViewById(R.id.homeworks)

        btn_tasks.setOnClickListener {
            startActivity(Intent(this, TaskMenuActivity::class.java))
        }

        btn_challenges.setOnClickListener {
            startActivity(Intent(this, ChallengesMenuActivity::class.java))
        }

        btn_homeworks.setOnClickListener {
            startActivity(Intent(this, HomeworkMenuActivity::class.java))
        }
    }
}