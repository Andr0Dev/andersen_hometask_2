package edu.filonenkooleksandr.lessontwo.tasks.task_two

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import edu.filonenkooleksandr.lessontwo.databinding.ActivityTaskTwoBinding
import edu.filonenkooleksandr.lessontwo.tasks.task_one.SecondActivity

class TaskTwoActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityTaskTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityTaskTwoBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            val intent = it.data
            viewBinding.textMessageReply.text = intent?.extras?.getString(
                MessageActivity.EXTRA_REPLY
            ).toString()
        }

        viewBinding.send.setOnClickListener {
            val intentSend = Intent(this, SecondActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, viewBinding.editTextMain.text.toString())
            }
            result.launch(intentSend)

            viewBinding.textHeaderReply.visibility = View.VISIBLE
            viewBinding.textMessageReply.visibility = View.VISIBLE
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
        val EXTRA_MESSAGE = "edu.filonenkooleksandr.lessontwo.extras.MESSAGE"
        private val TAG: String = "TaskTwoActivity"
    }
}