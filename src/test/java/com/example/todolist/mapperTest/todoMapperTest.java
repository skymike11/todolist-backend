package com.example.todolist.mapperTest;

import com.example.mapper.Mapper;
import com.example.todolist.dto.TodoRequestDto;
import com.example.todolist.dto.TodoResponseDto;
import com.example.todolist.entity.Todo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class todoMapperTest {
    @Test
    void should_return_responseDto_id_1_when_use_mapper_given_id_1_todo() {
        //given
        int todoId = 1;
        Todo todo = new Todo(todoId,"111", false);
        //when
        TodoResponseDto todoResponseDto = Mapper.entityToResponseDto(todo);
        //then
        assertEquals(todoId, todoResponseDto.getId());
    }

    @Test
    void should_return_todo_id_1_when_use_mapper_given_id_1_todoRequestDto() {
        //given
        int todoId = 1;
        TodoRequestDto todoRequestDto = new TodoRequestDto(todoId, "111", false);
        //when
        Todo todo = Mapper.resuestToEntity(todoRequestDto);
        //then
        assertEquals(1, todo.getId());
    }




}
