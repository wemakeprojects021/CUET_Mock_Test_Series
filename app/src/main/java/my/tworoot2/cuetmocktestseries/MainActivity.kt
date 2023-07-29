package my.tworoot2.cuetmocktestseries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.tworoot2.cuetmocktestseries.loginSignUP.LoginSignup
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        Timer().schedule(object : TimerTask() {
            override fun run() {
                startActivity(Intent(applicationContext, LoginSignup::class.java))
                finish()
            }
        }, 1000)


    }
}