package com.example.user.firstproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var mIsLogin = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(mIsLogin){
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fl_main_container, HomeFragment(), "HomeFragment")
                    .commit()
        }else{
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fl_main_container, LoginFragment(), "LoginFragment")
                    .commit()
        }



    }
}