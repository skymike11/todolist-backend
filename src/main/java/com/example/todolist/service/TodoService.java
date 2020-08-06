package com.example.todolist.service;

import com.example.todolist.dto.TodoRequestDto;
import com.example.todolist.dto.TodoResponseDto;
import com.example.todolist.entity.TodoEntity;

import java.util.List;

public interface TodoService {
    List<TodoEntity> getAllTodo();

    TodoResponseDto addTodo(TodoRequestDto todoRequestDto);

    void deleteTodoById(int id);

    TodoResponseDto updateTodo(int todoId, TodoEntity todoEntity);
}
