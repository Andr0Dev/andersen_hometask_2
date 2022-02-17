package edu.filonenkooleksandr.lessontwo.homeworks.homework_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.filonenkooleksandr.lessontwo.R
import edu.filonenkooleksandr.lessontwo.databinding.ActivityToastBinding

class ToastActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityToastBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityToastBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val message = intent
            .extras?.getString("edu.filonenkooleksandr.lessontwo.extras.MESSAGE")
            .toString()
        viewBinding.helloMessage.text = getString(R.string.message, message)

    }
}