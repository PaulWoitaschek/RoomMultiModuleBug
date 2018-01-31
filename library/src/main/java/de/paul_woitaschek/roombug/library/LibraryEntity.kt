package de.paul_woitaschek.roombug.library

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "libraryEntity")
data class LibraryEntity(
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")
        val arg0: Long,
        @ColumnInfo(name = "name")
        val arg1: String
)
