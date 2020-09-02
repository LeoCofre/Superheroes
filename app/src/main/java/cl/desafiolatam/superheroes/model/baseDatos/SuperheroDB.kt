package cl.desafiolatam.superheroes.model.baseDatos

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import cl.desafiolatam.superheroes.model.dataclass.Superheroes

class SuperheroDB {
    @Database(
        entities = [Superheroes::class],
        version = 1,
        exportSchema = false
    )

    abstract class HeroesRoomDatabase : RoomDatabase() {

        abstract fun superheroeDao(): SuperheroDao

        companion object {

            @Volatile
            private var INSTANCE: HeroesRoomDatabase? = null

            fun getDatabase(context: Context): HeroesRoomDatabase {
                val tempInstance = INSTANCE
                if (tempInstance != null) {
                    return tempInstance
                }

                synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        HeroesRoomDatabase::class.java,
                        "word_database"
                    ).build()
                    INSTANCE = instance
                    return instance
                }
            }
        }
    }
}

