package edu.filonenkooleksandr.lessonone.challenges.challenge_one

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import edu.filonenkooleksandr.lessonone.R

class ChallengeOneActivity : AppCompatActivity() {

    private val TAG: String = "ChallengeOneActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge_one)
        val userName = findViewById<EditText>(R.id.eText_userName);

        val greetingMessage = findViewById<TextView>(R.id.tView_message)

        val btnGreeting = findViewById<Button>(R.id.btn_greeting)
        btnGreeting.setOnClickListener {
            if (TextUtils.isEmpty(userName.text.toString())) {
                Log.e(TAG, "You need to type name of a birthday boy/girl")
            }
            else {
                closeKeyboard()
                val user = userName.text.toString()
                val message = getString(R.string.happy_birthday, user)
                greetingMessage.visibility = View.VISIBLE
                btnGreeting.visibility = View.INVISIBLE;
                greetingMessage.text = message
                greetingMessage.textSize = 20F
            }
        }
    }

    private fun closeKeyboard() {
        val view = this.currentFocus;
        view.let {
            val inputMethod = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethod.hideSoftInputFromWindow(view?.windowToken, 0)
        }
    }
}