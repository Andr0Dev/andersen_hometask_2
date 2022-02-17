package edu.filonenkooleksandr.lessonone.homeworks.homework_two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import edu.filonenkooleksandr.lessonone.R
import edu.filonenkooleksandr.lessonone.databinding.ActivityHomeworkTwoBinding

class HomeworkTwoActivity : AppCompatActivity() {

    private lateinit var toastBtn: Button
    private lateinit var zeroBtn: Button
    private lateinit var showCount: TextView

    private lateinit var binding: ActivityHomeworkTwoBinding

    private var countValue: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeworkTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        toastBtn = findViewById(R.id.toast)
        zeroBtn = findViewById(R.id.zero)
        showCount = findViewById(R.id.show_count)

        toastBtn.setOnClickListener {
            Toast.makeText(this, getString(R.string.toast_message), Toast.LENGTH_LONG)
                .show()
        }

        binding.count.setOnClickListener {
            countValue++
            showCount.text = countValue.toString()
            val view = findViewById<Button>(R.id.zero)
            view.backgroundTintList = ContextCompat
                .getColorStateList(this, R.color.zero_button_color)
        }

        zeroBtn.setOnClickListener {
            showCount.text = getString(R.string._0);
            zeroBtn.isSelected = !zeroBtn.isSelected
            it.backgroundTintList = ContextCompat
                .getColorStateList(this, R.color.zero_button_color)
        }
    }
}