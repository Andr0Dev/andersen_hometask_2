package edu.filonenkooleksandr.lessontwo.tasks.task_two

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import edu.filonenkooleksandr.lessontwo.databinding.ActivityMessageBinding

class MessageActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMessageBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.textMessage.text = intent.extras?.getString(
            TaskTwoActivity.EXTRA_MESSAGE
        ).toString()

        viewBinding.reply.setOnClickListener {
            val reply = viewBinding.replyMessage.text.toString()
            val replyIntent = Intent().apply {
                putExtra(EXTRA_REPLY, reply)
            }
            setResult(RESULT_OK, replyIntent)
            finish()
        }

        Log.d(TAG, "onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    companion object {
        val EXTRA_REPLY = "edu.filonenkooleksandr.lessontwo.extras.REPLY"
        private val TAG: String = "MessageActivity"
    }
}