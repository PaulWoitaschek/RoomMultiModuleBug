package de.paul_woitaschek.roombug

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import de.paul_woitaschek.roombug.library.LibraryDao
import de.paul_woitaschek.roombug.library.LibraryEntity

@Database(
        entities = [LibraryEntity::class],
        version = 1
)
abstract class MyDb : RoomDatabase() {

    abstract fun dao(): LibraryDao
}