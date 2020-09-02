package cl.desafiolatam.superheroes.model.dataclass


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Superheroes(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val slug: String,
    val name: String,
    )


