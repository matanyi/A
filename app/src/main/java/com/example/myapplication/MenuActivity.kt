package com.example.myapplication
import kotlinx.android.synthetic.main.activity_menu.textview_random
import kotlinx.android.synthetic.main.activity_menu.textview_label
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MenuActivity : AppCompatActivity() {

    companion object {

        const val TOTAL_COUNT = "total_count"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        showRandomNumber()
    }
    fun showRandomNumber() {
        // Get the count from the intent extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        // Generate the random number
        val random = Random()
        var randomInt = 0
        // Add one because the bound is exclusive
        if (count > 0) {
            // Add one because the bound is exclusive
            randomInt = random.nextInt(count + 1)
        }
        // Display the random number.
        textview_random.text = Integer.toString(randomInt)
        // Substitute the max value into the string resource
        // for the heading, and update the heading
        textview_label.text = getString(R.string.random_heading, count)
    }
}