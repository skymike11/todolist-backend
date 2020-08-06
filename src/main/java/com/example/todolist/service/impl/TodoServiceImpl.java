package com.example.todolist.service.impl;

import com.example.todolist.repository.TodoRepository;
import com.example.todolist.dto.TodoRequestDto;
import com.example.todolist.dto.TodoResponseDto;
import com.example.todolist.entity.TodoEntity;
import com.example.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<TodoEntity> getAllTodo() {
        return todoRepository.findAll();
    }

    @Override
    public TodoResponseDto addTodo(TodoRequestDto todoRequestDto) {
        todoRepository.save(todoRequestDto.toEntity());
        return todoRequestDto.toTodoResponseDto();
    }

    @Override
    public void deleteTodoById(int id) {
        todoRepository.deleteById(id);
    }

    @Override
    public TodoResponseDto updateTodo(int todoId, TodoEntity todoEntity) {
        todoRepository.save(todoEntity);
        return todoEntity.toTodoResponseDto();
    }
}
