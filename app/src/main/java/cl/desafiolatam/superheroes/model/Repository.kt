package cl.desafiolatam.superheroes.model

import android.content.Context
import androidx.lifecycle.LiveData
import cl.desafiolatam.superheroes.model.baseDatos.SuperheroDB
import cl.desafiolatam.superheroes.model.dataclass.Superheroes

import cl.desafiolatam.superheroes.model.retrofit.RetrofitClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import retrofit2.Call
import java.util.ArrayList

class Repository(context: Context) {
    //aca se instancia primero la base de datos, para luego instanciar nuestra lista desde la base de datos

    private val database = SuperheroDB.HeroesRoomDatabase.getDatabase(context)

    private val listaHeroes = database.superheroeDao().getAllSuperHeroesFromDB()


    //funcion para obtener la lista de superheroes desde la DB

    fun getLiveDataHeroListFromDB(): LiveData<List<Superheroes>>{
        return listaHeroes
    }

    suspend fun getAllHeroes(call: Any?) = RetrofitClient.retrofitInstance().getAllHeroesFromApi()

    fun insertHeroes() {

        CoroutineScope(IO).launch {
          //database.superheroeDao().insertAllSuperheroesInDB()

        }
    }

}

