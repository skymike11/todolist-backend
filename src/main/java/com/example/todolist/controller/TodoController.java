package com.example.todolist.controller;


import com.example.todolist.dto.TodoRequestDto;
import com.example.todolist.dto.TodoResponseDto;
import com.example.todolist.entity.TodoEntity;
import com.example.todolist.service.TodoService;
import com.example.todolist.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private  TodoService todoService;


    @GetMapping
    public List<TodoResponseDto> getAllTodos() {
        List<TodoResponseDto> todoResponseDtoList = new ArrayList<>();
        todoService.getAllTodo().forEach(todo -> {
            TodoResponseDto todoResponseDto = Mapper.entityToResponseDto(todo);
            todoResponseDtoList.add(todoResponseDto);
        });
        return todoResponseDtoList;
    }

    @PostMapping
    public TodoResponseDto addTodo(@RequestBody TodoRequestDto todoRequestDto) {
        return todoService.addTodo(todoRequestDto);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable("id") int todoId) {
        todoService.deleteTodoById(todoId);
    }

    @PutMapping("/{id}")
    public void updateTodo (@PathVariable("id") int todoId,
                            @RequestBody TodoRequestDto todoRequestDto) {
        todoService.updateTodo(todoId, Mapper.resuestToEntity(todoRequestDto));
    }

}
