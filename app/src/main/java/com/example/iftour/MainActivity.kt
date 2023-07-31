package com.example.iftour

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }

        fun inscricao(view: View){
            val webpage: Uri = Uri.parse("https://processoseletivo.ifmt.edu.br/")
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            startActivity(intent)
        }
        fun localizacao(view: View) {
            val gmmIntentUri = Uri.parse("geo:-15.873904088847597, -52.29794483784141")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            }
        }

        fun horario(view: View){
            val url = "https://cursosead.ifmt.edu.br/login/index.php"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

    }
}