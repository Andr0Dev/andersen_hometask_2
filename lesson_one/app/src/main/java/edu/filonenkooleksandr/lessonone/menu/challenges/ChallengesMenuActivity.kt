package edu.filonenkooleksandr.lessonone.menu.challenges

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import edu.filonenkooleksandr.lessonone.R
import edu.filonenkooleksandr.lessonone.challenges.challenge_four.ChallengeFourActivity
import edu.filonenkooleksandr.lessonone.challenges.challenge_one.ChallengeOneActivity
import edu.filonenkooleksandr.lessonone.challenges.challenge_three.ChallengeThreeActivity
import edu.filonenkooleksandr.lessonone.challenges.challenge_two.ChallengeTwoActivity

class ChallengesMenuActivity : AppCompatActivity() {

    private lateinit var challengeOne: Button
    private lateinit var challengeTwo: Button
    private lateinit var challengeThree: Button
    private lateinit var challengeFour: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenges_menu)

        challengeOne = findViewById(R.id.challenge_one)
        challengeOne.setOnClickListener {
            startActivity(Intent(this, ChallengeOneActivity::class.java))
        }

        challengeTwo = findViewById(R.id.challenge_two)
        challengeTwo.setOnClickListener {
            startActivity(Intent(this, ChallengeTwoActivity::class.java))
        }

     challengeThree = findViewById(R.id.challenge_three)
        challengeThree.setOnClickListener {
            startActivity(Intent(this, ChallengeThreeActivity::class.java))
        }

        challengeFour = findViewById(R.id.challenge_four)
        challengeFour.setOnClickListener {
            startActivity(Intent(this, ChallengeFourActivity::class.java))
        }
    }
}