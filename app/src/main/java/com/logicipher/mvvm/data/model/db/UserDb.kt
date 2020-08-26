package com.logicipher.mvvm.data.model.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Shamji N S on 20-08-2020.
 */
@Entity(tableName = "user")
public class UserDb {

    @PrimaryKey
    @ColumnInfo(name = "id")
    var id : Long = 0

}