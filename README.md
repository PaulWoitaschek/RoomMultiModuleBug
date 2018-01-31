# RoomMultiModuleBug

https://issuetracker.google.com/issues/68118746

This project has a room entity with a dao in the library module and has it's Room database in the app module.

If you now change in the [LibraryDao](https://github.com/PaulWoitaschek/RoomMultiModuleBug/blob/master/library/src/main/java/de/paul_woitaschek/roombug/library/LibraryDao.kt)
the select statement from `WHERE id = :arg0` to `WHERE id = :id` it fails to compile.

The same for the [LibraryEntity](https://github.com/PaulWoitaschek/RoomMultiModuleBug/blob/master/library/src/main/java/de/paul_woitaschek/roombug/library/LibraryEntity.kt).
If the properties are not named `arg0`, `arg1` it fails to compile.
