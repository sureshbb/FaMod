package com.stardev.devmod

import android.content.Context
import android.content.Intent

class Dev {

    companion object{

        fun launchWelcome(context: Context , name:String){
           val intent = Intent(context, WelcomeActivity::class.java)
            intent.putExtra("welcome-name", name)
            context.startActivity(intent)
        }

        fun launchGreet(context: Context, name:String){
            val intent = Intent(context, GreetActivity::class.java)
            intent.putExtra("greet-name", name)
            context.startActivity(intent)
        }
    }

}