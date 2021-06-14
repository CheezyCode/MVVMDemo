package com.cheezycode.mvvmdemo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quote")
data class Quote(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val text: String,
    val author: String
)
