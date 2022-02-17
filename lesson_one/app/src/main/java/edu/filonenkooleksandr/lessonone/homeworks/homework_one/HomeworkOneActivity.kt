package edu.filonenkooleksandr.lessonone.homeworks.homework_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import edu.filonenkooleksandr.lessonone.R

class HomeworkOneActivity : AppCompatActivity() {

    private val TAG: String = "Homework Tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework_one)

        Log.d(TAG,"This is debug of homework app!!!!")
    }
}