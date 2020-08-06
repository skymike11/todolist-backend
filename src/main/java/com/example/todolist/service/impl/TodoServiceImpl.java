package com.example.todolist.service.impl;

import com.example.repository.TodoRepository;
import com.example.todolist.dto.TodoRequestDto;
import com.example.todolist.entity.Todo;
import com.example.todolist.service.TodoService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @Override
    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }

    @Override
    public void addTodo(TodoRequestDto todoRequestDto) {
        todoRepository.save(todoRequestDto.toEntity());
    }

    @Override
    public void deleteTodoById(int id) {
        todoRepository.deleteById(id);
    }
}
