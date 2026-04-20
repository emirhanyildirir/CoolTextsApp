package com.example.cooltexts

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Android'in kendi sistem çubuğu (saat, pil vs.) ayarları
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // --- BİZİM KODLAR BURADAN BAŞLIYOR ---

        // 1. Kaportadaki yazıyı ID'si ile bulup değişkene bağladık
        val anaYazi = findViewById<TextView>(R.id.txtGosterge)

        // 2. Yazının içeriğini kodla değiştirdik
        anaYazi.text = "Aga her şeyi kodla kontrol ediyoruz!"

        // --- BİZİM KODLAR BURADA BİTİYOR ---
    }
}