package ruwanbandara.loginui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        button3.setOnClickListener{
            val intent1 = Intent(this,sign_in::class.java)
            startActivity(intent1)
        }
    }
}
