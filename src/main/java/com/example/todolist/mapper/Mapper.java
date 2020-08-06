package com.example.todolist.mapper;


import com.example.todolist.dto.TodoRequestDto;
import com.example.todolist.dto.TodoResponseDto;
import com.example.todolist.entity.TodoEntity;
import org.springframework.beans.BeanUtils;

public class Mapper {
    public static TodoResponseDto entityToResponseDto(TodoEntity todoEntity) {
        TodoResponseDto todoResponseDto = new TodoResponseDto();
        BeanUtils.copyProperties(todoEntity, todoResponseDto);
        return todoResponseDto;
    }

    public static TodoEntity resuestToEntity (TodoRequestDto todoRequestDto) {
        TodoEntity todoEntity = new TodoEntity();
        BeanUtils.copyProperties(todoRequestDto,todoEntity);
        return todoEntity;
    }
}
