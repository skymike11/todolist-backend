package com.example.todolist.service;

import com.example.todolist.dto.TodoRequestDto;
import com.example.todolist.dto.TodoResponseDto;
import com.example.todolist.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodo();
    TodoResponseDto addTodo(TodoRequestDto todoRequestDto);
    void deleteTodoById(int id);
    TodoResponseDto updateTodo(Todo todo);
}
