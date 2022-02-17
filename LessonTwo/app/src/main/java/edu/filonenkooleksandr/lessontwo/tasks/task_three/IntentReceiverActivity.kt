package edu.filonenkooleksandr.lessontwo.tasks.task_three

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.filonenkooleksandr.lessontwo.R
import edu.filonenkooleksandr.lessontwo.databinding.ActivityIntentReceiverBinding

class IntentReceiverActivity : AppCompatActivity() {

    private lateinit var binding:ActivityIntentReceiverBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentReceiverBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val uri = intent.data
        uri?.run {
            binding.textUriMessage.text = getString(R.string.uri_label).plus(uri.toString())
        }
    }
}