package edu.filonenkooleksandr.lessonone.menu.homeworks

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import edu.filonenkooleksandr.lessonone.R
import edu.filonenkooleksandr.lessonone.homeworks.homework_one.HomeworkOneActivity
import edu.filonenkooleksandr.lessonone.homeworks.homework_three.HomeworkThreeActivity
import edu.filonenkooleksandr.lessonone.homeworks.homework_two.HomeworkTwoActivity

class HomeworkMenuActivity : AppCompatActivity() {

    private lateinit var homeworkOne: Button
    private lateinit var homeworkTwo: Button
    private lateinit var homeworkThree: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework_menu)

        homeworkOne = findViewById(R.id.hw_one)
        homeworkTwo = findViewById(R.id.hw_two)
        homeworkThree = findViewById(R.id.hw_three)

        homeworkOne.setOnClickListener {
            startActivity(Intent(this, HomeworkOneActivity::class.java))
        }

        homeworkTwo.setOnClickListener {
            startActivity(Intent(this, HomeworkTwoActivity::class.java))
        }

        homeworkThree.setOnClickListener {
            startActivity(Intent(this, HomeworkThreeActivity::class.java))
        }
    }
}