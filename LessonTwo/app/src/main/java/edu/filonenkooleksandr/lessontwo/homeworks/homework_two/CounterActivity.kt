package edu.filonenkooleksandr.lessontwo.homeworks.homework_two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import edu.filonenkooleksandr.lessontwo.R
import edu.filonenkooleksandr.lessontwo.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityCounterBinding

    private var countValue: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityCounterBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.count.setOnClickListener {
            countValue++
            viewBinding.counterDisplay.text = countValue.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.run {
            putInt("count", countValue)
        }
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        viewBinding.counterDisplay.text = savedInstanceState.get("count").toString()
        super.onRestoreInstanceState(savedInstanceState)
    }
}