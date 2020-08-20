package com.logicipher.mvvm.data.local.database

import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase
import com.logicipher.mvvm.data.local.database.dao.UserDao
import com.logicipher.mvvm.data.model.db.UserDb

/**
 * Created by Shamji N S on 20-08-2020.
 */
@Database(
    entities = [UserDb::class],
    version = 2,
    exportSchema = false
)
public abstract class AppDatabase : RoomDatabase() {

    abstract val userDao :UserDao
}