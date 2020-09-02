package cl.desafiolatam.superheroes.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.desafiolatam.superheroes.R
import cl.desafiolatam.superheroes.model.baseDatos.SuperheroDB

class MainActivity : AppCompatActivity() {

    val app = applicationContext as SuperheroDB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
