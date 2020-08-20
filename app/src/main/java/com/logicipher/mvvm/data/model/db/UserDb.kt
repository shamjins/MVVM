package com.logicipher.mvvm.data.model.db

import androidx.room.ColumnInfo
import androidx.room.Entity

/**
 * Created by Shamji N S on 20-08-2020.
 */
@Entity(tableName = "user")
public class UserDb {

    @ColumnInfo(name = "id")
    val id : Long = 0

}