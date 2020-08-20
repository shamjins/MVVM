package com.logicipher.mvvm.data.local.database.dao

import androidx.room.Dao
import androidx.room.Delete
import com.logicipher.mvvm.data.model.db.UserDb

/**
 * Created by Shamji N S on 20-08-2020.
 */
@Dao
public interface UserDao {

    @Delete
    fun delete(userDb: UserDb)
}