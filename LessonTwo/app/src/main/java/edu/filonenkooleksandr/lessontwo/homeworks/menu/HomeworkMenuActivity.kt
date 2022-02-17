package edu.filonenkooleksandr.lessontwo.homeworks.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.filonenkooleksandr.lessontwo.R
import edu.filonenkooleksandr.lessontwo.databinding.ActivityHomeworkMenuBinding
import edu.filonenkooleksandr.lessontwo.homeworks.homework_one.HomeworkOneActivity
import edu.filonenkooleksandr.lessontwo.homeworks.homework_three.LaunchCameraActivity
import edu.filonenkooleksandr.lessontwo.homeworks.homework_two.CounterActivity

class HomeworkMenuActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityHomeworkMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityHomeworkMenuBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.hometaskOne.setOnClickListener {
            startActivity(Intent(this, HomeworkOneActivity::class.java))
        }

        viewBinding.hometaskTwo.setOnClickListener {
            startActivity(Intent(this, CounterActivity::class.java))
        }

        viewBinding.hometaskThree.setOnClickListener {
            startActivity(Intent(this, LaunchCameraActivity::class.java))
        }
    }
}