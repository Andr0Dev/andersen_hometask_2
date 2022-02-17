package edu.filonenkooleksandr.lessonone.challenges.challenge_three

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import edu.filonenkooleksandr.lessonone.R

class ChallengeThreeActivity : AppCompatActivity() {

    private var count: Int = 0
    private lateinit var showCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge_three)

        showCount = findViewById(R.id.show_count)
    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }
    fun countUp(view: View) {
        count++
        showCount.text = count.toString()
    }
}