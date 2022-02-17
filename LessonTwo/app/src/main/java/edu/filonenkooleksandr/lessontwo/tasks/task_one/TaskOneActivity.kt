package edu.filonenkooleksandr.lessontwo.tasks.task_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import edu.filonenkooleksandr.lessontwo.R
import edu.filonenkooleksandr.lessontwo.databinding.ActivityTaskOneBinding

class TaskOneActivity : AppCompatActivity() {

    private val debugMessage = "Button was clicked!!"

    private lateinit var binding: ActivityTaskOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaskOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            val intent = it.data
            binding.textMessageReply.text = intent?.extras?.getString(
                SecondActivity.EXTRA_REPLY
            ).toString()
        }

        binding.send.setOnClickListener {
            Log.d(TAG, debugMessage)
            val intentSend = Intent(this, SecondActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, binding.editTextMain.text.toString())
            }
            result.launch(intentSend)

            binding.textHeaderReply.visibility = View.VISIBLE
            binding.textMessageReply.visibility = View.VISIBLE
        }
    }

    companion object {
        val EXTRA_MESSAGE = "edu.filonenkooleksandr.lessontwo.extras.MESSAGE"
        private val TAG: String = "TaskOneActivity"
    }
}