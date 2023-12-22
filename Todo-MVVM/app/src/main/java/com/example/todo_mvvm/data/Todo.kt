package com.example.todo_mvvm.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo", primaryKeys = ["id"])
data class Todo(
    val title: String,
    val description: String?,
    val isDone: Boolean,
    @PrimaryKey val id: Int? = null
)
