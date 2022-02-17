package edu.filonenkooleksandr.lessontwo.homeworks.homework_three

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import edu.filonenkooleksandr.lessontwo.databinding.ActivityLaunchCameraBinding

class LaunchCameraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLaunchCameraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLaunchCameraBinding.inflate(layoutInflater)
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

        binding.launchCameraButton.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
        }
    }

    companion object {
        val REQUEST_IMAGE_CAPTURE = 1
    }
}