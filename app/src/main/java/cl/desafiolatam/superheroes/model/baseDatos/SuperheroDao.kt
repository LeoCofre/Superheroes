package cl.desafiolatam.superheroes.model.baseDatos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import cl.desafiolatam.superheroes.model.dataclass.Superheroes

@Dao
interface SuperheroDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllSuperheroesInDB(listHero:List<Superheroes>)

    @Query("SELECT * FROM Superheroes ")
    fun getAllSuperHeroesFromDB(): LiveData<List<Superheroes>>



}