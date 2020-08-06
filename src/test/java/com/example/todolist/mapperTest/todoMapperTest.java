package com.example.todolist.mapperTest;

import com.example.mapper.Mapper;
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
        Todo todo = new Todo(1,"111", false);
        //when
        TodoResponseDto todoResponseDto = Mapper.entityToResponseDto(todo);
        //then
        assertEquals(1, todoResponseDto.getId());
    }


}
