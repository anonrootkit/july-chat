package com.example.july.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.july.data.db.dao.ProfileDao
import com.example.july.data.db.entity.ProfileEntity

@Database(entities = [ProfileEntity::class], version = 1)
abstract class ChatDatabase : RoomDatabase() {
    abstract fun profileDao() : ProfileDao
}