package com.elnaggar.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    /**
     * called only one during the lifetime of activity
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    /**
     * restore state from process death
     */
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Toast.makeText(this, savedInstanceState.getString("death","no") ?:"",Toast.LENGTH_SHORT).show()

    }

    /**
     * save state when process death happen
     */
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("death","yes")
        super.onSaveInstanceState(outState)
    }

    /**
     * not used normally but if you have special logic that happen when activity restart
     */
    override fun onRestart() {
        super.onRestart()
    }

    /**
     * visible life time starts here
     */
    override fun onStart() {
        super.onStart()
        startTheListeners()
    }

    /**
     * active life time start here
     * keep code fast and light weight
     */
    override fun onResume() {
        super.onResume()
    }





    /**
     * used to stop any thing that update the ui like animation or any updates like sensor or gps
     * lookups
     * you can safely assume will be called before process death
     */
    override fun onStop(){
        super.onStop()
        pauseOrStopAnyThingThatUpdateUi();
    }

    /**
     * cleanup any resources created in onCreate and ensure any external connections is clothed
     */
    override fun onDestroy() {
        cleanUp()
        super.onDestroy()
    }

    private fun cleanUp() {

    }

    private fun startTheListeners() {

    }
    private fun pauseOrStopAnyThingThatUpdateUi() {

    }
}