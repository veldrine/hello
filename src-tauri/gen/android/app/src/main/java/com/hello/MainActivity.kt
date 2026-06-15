package com.hello

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : TauriActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()

    // Mengambil controller untuk window
    val controller = WindowCompat.getInsetsController(window, window.decorView)
    
    // Menyembunyikan status bar dan navigation bar
    controller.hide(WindowInsetsCompat.Type.systemBars())
    
    // Mengatur perilaku agar bar muncul kembali dengan swipe (Immersive mode)
    controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
  }
}
