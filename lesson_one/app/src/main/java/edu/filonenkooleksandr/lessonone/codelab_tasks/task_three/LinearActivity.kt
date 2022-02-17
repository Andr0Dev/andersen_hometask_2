package edu.filonenkooleksandr.lessonone.codelab_tasks.task_three

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import edu.filonenkooleksandr.lessonone.R

class LinearActivity : AppCompatActivity() {

    private lateinit var toastBtn: Button
    private lateinit var countBtn: Button
    private lateinit var showCount: TextView

    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        toastBtn = findViewById(R.id.toast)
        countBtn = findViewById(R.id.count)
        showCount = findViewById(R.id.show_count)

    }

    fun showToast(view: View) {
        Toast.makeText(this, getString(R.string.toast_message), Toast.LENGTH_LONG)
            .show()
    }
    fun countUp(view: View) {
        count++
        showCount.text = count.toString()
    }
}