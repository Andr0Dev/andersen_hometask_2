package edu.filonenkooleksandr.lessonone.codelab_tasks.task_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import edu.filonenkooleksandr.lessonone.R

class TaskOneActivity : AppCompatActivity() {

    private val TAG: String = "TaskOneActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_one)
        Log.d(TAG, "Hello World!")
    }
}