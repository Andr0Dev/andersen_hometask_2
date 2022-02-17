package edu.filonenkooleksandr.lessontwo.homeworks.homework_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.filonenkooleksandr.lessontwo.R
import edu.filonenkooleksandr.lessontwo.databinding.ActivityHomeworkOneBinding

class HomeworkOneActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityHomeworkOneBinding
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityHomeworkOneBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.toast.setOnClickListener {
            val toastIntent = Intent(this, ToastActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, viewBinding.showCount.text.toString())
            }
            startActivity(toastIntent)
        }

        viewBinding.count.setOnClickListener {
            counter++
            viewBinding.showCount.text = counter.toString()
        }
    }

    companion object {
        private val EXTRA_MESSAGE = "edu.filonenkooleksandr.lessontwo.extras.MESSAGE"
    }
}