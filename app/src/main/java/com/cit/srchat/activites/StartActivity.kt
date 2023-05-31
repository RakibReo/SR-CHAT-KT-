package com.cit.srchat.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cit.srchat.R
import com.cit.srchat.databinding.ActivityMainBinding
import com.cit.srchat.databinding.ActivityStartBinding
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding
    private lateinit var firebaseUser: FirebaseUser

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firebaseUser = Firebase.auth.currentUser

        if (firebaseUser != null) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        binding.loginBtn.setOnClickListener{

            startActivity(Intent(this, LoginActivity::class.java))


        }


        binding.registerBtn.setOnClickListener{

            startActivity(Intent(this,RegisterActivity::class.java))


        }

    }
}