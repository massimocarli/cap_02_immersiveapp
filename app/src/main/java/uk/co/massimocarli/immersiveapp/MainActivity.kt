package uk.co.massimocarli.immersiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window?.decorView?.apply {
            // Dim the status bar
            //systemUiVisibility = View.SYSTEM_UI_FLAG_LOW_PROFILE
            // Hide the status bar
            //systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
            // Hide the Navigation bar
            //systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            // Lean
            systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }
        setContentView(R.layout.activity_main)
    }
}
