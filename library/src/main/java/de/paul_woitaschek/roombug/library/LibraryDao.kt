package de.paul_woitaschek.roombug.library

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query

@Dao
interface LibraryDao {

    @Query("SELECT * FROM libraryEntity WHERE id = :arg0")
    fun byId(id: Long): List<LibraryEntity>
}
