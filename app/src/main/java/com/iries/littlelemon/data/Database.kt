package com.iries.littlelemon.data

import androidx.room.RoomDatabase


@androidx.room.Database(entities = [MenuEntity::class], version = 1, exportSchema = false)
abstract class Database : RoomDatabase() {
    abstract val menuDao: MenuDao
}