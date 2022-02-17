package edu.filonenkooleksandr.lessontwo.challenges.challenge_two

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import edu.filonenkooleksandr.lessontwo.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityListBinding

    private var indexOfItem: Int? = null
    private var productName: String? = null

    private var bundleArray: HashMap<Int, String> = HashMap()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityListBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            val intent = it.data
            indexOfItem = intent?.extras?.getInt("index")
            productName = intent?.extras?.getString("name")
            indexOfItem?.let { key -> productName?.let { value -> bundleArray.put(key, value) } }
            when (indexOfItem) {
                0 -> {
                    viewBinding.productOne.text = productName
                    viewBinding.productOne.visibility = View.VISIBLE
                }
                1 -> {
                    viewBinding.productTwo.text = productName
                    viewBinding.productTwo.visibility = View.VISIBLE
                }
                2 -> {
                    viewBinding.productThree.text = productName
                    viewBinding.productThree.visibility = View.VISIBLE
                }
                3 -> {
                    viewBinding.productFour.text = productName
                    viewBinding.productFour.visibility = View.VISIBLE
                }
                4 -> {
                    viewBinding.productFive.text = productName
                    viewBinding.productFive.visibility = View.VISIBLE
                }
                5 -> {
                    viewBinding.productSix.text = productName
                    viewBinding.productSix.visibility = View.VISIBLE
                }
                6 -> {
                    viewBinding.productSeven.text = productName
                    viewBinding.productSeven.visibility = View.VISIBLE
                }
                7 -> {
                    viewBinding.productEight.text = productName
                    viewBinding.productEight.visibility = View.VISIBLE
                }
                8 -> {
                    viewBinding.productNine.text = productName
                    viewBinding.productNine.visibility = View.VISIBLE
                }
                9 -> {
                    viewBinding.productTen.text = productName
                    viewBinding.productTen.visibility = View.VISIBLE
                }
                else -> {
                    Log.i("Info", "IncorrectIndex")
                }
            }
        }

        viewBinding.addItem.setOnClickListener {
            result.launch(Intent(this, ChoiceActivity::class.java))
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.run {
            putSerializable("items", bundleArray)
        }
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        val data = savedInstanceState.getSerializable("items") as HashMap<*, *>
        data.keys.forEach { it ->
            when (it) {
                0 -> {
                    viewBinding.productOne.text = data[it].toString()
                    viewBinding.productOne.visibility = View.VISIBLE
                }
                1 -> {
                    viewBinding.productTwo.text = data[it].toString()
                    viewBinding.productTwo.visibility = View.VISIBLE
                }
                2 -> {
                    viewBinding.productThree.text = data[it].toString()
                    viewBinding.productThree.visibility = View.VISIBLE
                }
                3 -> {
                    viewBinding.productFour.text = data[it].toString()
                    viewBinding.productFour.visibility = View.VISIBLE
                }
                4 -> {
                    viewBinding.productFive.text = data[it].toString()
                    viewBinding.productFive.visibility = View.VISIBLE
                }
                5 -> {
                    viewBinding.productSix.text = data[it].toString()
                    viewBinding.productSix.visibility = View.VISIBLE
                }
                6 -> {
                    viewBinding.productSeven.text = data[it].toString()
                    viewBinding.productSeven.visibility = View.VISIBLE
                }
                7 -> {
                    viewBinding.productEight.text = data[it].toString()
                    viewBinding.productEight.visibility = View.VISIBLE
                }
                8 -> {
                    viewBinding.productNine.text = data[it].toString()
                    viewBinding.productNine.visibility = View.VISIBLE
                }
                9 -> {
                    viewBinding.productTen.text = data[it].toString()
                    viewBinding.productTen.visibility = View.VISIBLE
                }
                else -> {
                    Log.i("Info", "IncorrectIndex")
                }
            }
        }
        super.onRestoreInstanceState(savedInstanceState)
    }
}