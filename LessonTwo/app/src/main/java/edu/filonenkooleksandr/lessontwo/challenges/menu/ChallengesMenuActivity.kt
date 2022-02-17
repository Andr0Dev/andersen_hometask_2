package edu.filonenkooleksandr.lessontwo.challenges.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.filonenkooleksandr.lessontwo.challenges.challenge_one.ChallengeOneActivity
import edu.filonenkooleksandr.lessontwo.challenges.challenge_three.ProductListActivity
import edu.filonenkooleksandr.lessontwo.challenges.challenge_two.ListActivity
import edu.filonenkooleksandr.lessontwo.databinding.ActivityChallengesMenuBinding

class ChallengesMenuActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityChallengesMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityChallengesMenuBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.challengeOne.setOnClickListener {
            startActivity(Intent(this, ChallengeOneActivity::class.java))
        }

        viewBinding.challengeTwo.setOnClickListener {
            startActivity(Intent(this, ListActivity::class.java))
        }

        viewBinding.challengeThree.setOnClickListener {
            startActivity(Intent(this, ProductListActivity::class.java))
        }
    }
}