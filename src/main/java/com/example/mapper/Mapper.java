package com.example.mapper;


import com.example.todolist.dto.TodoRequestDto;
import com.example.todolist.dto.TodoResponseDto;
import com.example.todolist.entity.Todo;

public class Mapper {
    public static TodoResponseDto entityToResponseDto(Todo todo) {
        return new TodoResponseDto(todo.getId(), todo.getContent(), todo.getStatus());
    }

    public static Todo resuestToEntity (TodoRequestDto todoRequestDto) {
        return new Todo(todoRequestDto.getId(), todoRequestDto.getContent(), todoRequestDto.getStatus());
    }
}
