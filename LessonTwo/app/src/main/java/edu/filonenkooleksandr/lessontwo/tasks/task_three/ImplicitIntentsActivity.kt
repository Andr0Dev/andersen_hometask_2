package edu.filonenkooleksandr.lessontwo.tasks.task_three

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.app.ShareCompat
import edu.filonenkooleksandr.lessontwo.R
import edu.filonenkooleksandr.lessontwo.databinding.ActivityImplicitIntentsBinding
import java.net.URI

class ImplicitIntentsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityImplicitIntentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImplicitIntentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.openWebsiteButton.setOnClickListener {
            val url = binding.websiteEdittext.text.toString()
            val webPage = Uri.parse(url)
            val intent = Intent(Intent.ACTION_VIEW, webPage)
            startActivity(intent)
        }

        binding.openLocationButton.setOnClickListener {
            val location = binding.locationEdittext.text.toString()
            val addressUri = Uri.parse("geo:0,0?q=$location")
            val intent = Intent(Intent.ACTION_VIEW, addressUri)
            startActivity(intent)
        }

        binding.shareTextButton.setOnClickListener {
            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, binding.shareEdittext.text.toString())
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }
    }
}