package cl.desafiolatam.superheroes.model.retrofit

import cl.desafiolatam.superheroes.model.dataclass.Superheroes
import retrofit2.Call
import retrofit2.http.GET

interface SuperheroApi {

    @GET(" /all.json ")
    fun getAllHeroesFromApi(): Call<ArrayList<Superheroes>>
}