package com.example.todo_mvvm.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

//This allows us to define how we access data from the database
@Dao
interface TodoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: Todo)

    @Delete
    suspend fun deleteTodo(todo: Todo)

    @Query("SELECT * FROM todo WHERE id = :id")
    suspend fun getTodoById(id: Int): Todo?

    // Here we are using Flow to get an updated list of todos whenever the database changes
    @Query("SELECT * FROM todo")
    fun getTodos(): Flow<List<Todo>>
}