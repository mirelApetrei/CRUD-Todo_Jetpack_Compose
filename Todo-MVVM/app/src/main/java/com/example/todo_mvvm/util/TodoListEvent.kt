package com.example.todo_mvvm.util

import com.example.todo_mvvm.data.Todo

sealed class TodoListEvent {
    data class OnDeleteTodoClick(val todo: Todo): TodoListEvent()

    data class OnDoneChanged(val todo: Todo, val isDone: Boolean): TodoListEvent()

    object OnUndoDeleteClick: TodoListEvent()

    data class OnTodoClick(val todo: Todo): TodoListEvent()

    object OnAddTodoClick: TodoListEvent()

}