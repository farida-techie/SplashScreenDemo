package com.malkinfo.splasgscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.lang.Exception

class SplashScreenActivity : AppCompatActivity() {
     private lateinit var handler:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        /**ok now we set  second View*/
       setBackgroundSecond()

    }
    /** I give you Two Code, you have the choice you
     *  can set one of the two*/
    /**this is First code*/
    fun setFirstBackground(){
        val backgroundThread = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(4000) // delaying 4 seconds
                    val inte = Intent(baseContext,MainActivity::class.java)
                    startActivity(inte)
                }catch (e:Exception){
                    e.printStackTrace()
                }
            }
        }
        /**call background*/
        backgroundThread.start()
    }
    /**second code*/
    fun setBackgroundSecond(){
        handler = Handler()
        handler.postDelayed({
            val inte = Intent(this,MainActivity::class.java)
            startActivity(inte)
        },4000) // delaying 4 seconds
    }

}