package edu.filonenkooleksandr.lessontwo.tasks.task_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.filonenkooleksandr.lessontwo.R
import edu.filonenkooleksandr.lessontwo.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textMessage.text = intent.extras?.getString(
            TaskOneActivity.EXTRA_MESSAGE
        ).toString()

        binding.reply.setOnClickListener {
            val reply = binding.replyMessage.text.toString()
            val replyIntent = Intent().apply {
                putExtra(EXTRA_REPLY, reply)
            }
            setResult(RESULT_OK, replyIntent)
            finish()
        }
    }

    companion object {
        val EXTRA_REPLY = "edu.filonenkooleksandr.lessontwo.extras.REPLY"
    }
}