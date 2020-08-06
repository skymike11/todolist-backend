package com.example.todolist.mapperTest;

import com.example.todolist.mapper.Mapper;
import com.example.todolist.dto.TodoRequestDto;
import com.example.todolist.dto.TodoResponseDto;
import com.example.todolist.entity.TodoEntity;
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
        TodoEntity todoEntity = new TodoEntity(todoId,"111", false);
        //when
        TodoResponseDto todoResponseDto = Mapper.entityToResponseDto(todoEntity);
        //then
        assertEquals(todoId, todoResponseDto.getId());
    }

    @Test
    void should_return_content_111_when_use_mapper_given_content_111_todoRequestDto() {
        //given
        String content = "111";
        TodoRequestDto todoRequestDto = new TodoRequestDto(1, content, false);
        //when
        TodoEntity todoEntity = Mapper.resuestToEntity(todoRequestDto);
        //then
        assertEquals(content, todoEntity.getContent());
    }




}
