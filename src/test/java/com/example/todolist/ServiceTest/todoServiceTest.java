package com.example.todolist.ServiceTest;

import com.example.repository.TodoRepository;
import com.example.todolist.dto.TodoRequestDto;
import com.example.todolist.dto.TodoResponseDto;
import com.example.todolist.service.impl.TodoServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class todoServiceTest {
    @InjectMocks
    TodoServiceImpl todoService;

    @Mock
    TodoRepository todoRepository;

    @Test
    void should_return_0_when_get_all_todo_given_0_todo() {
        //given

        //when
        when(todoRepository.findAll()).thenReturn(new ArrayList<>());
        //then
        assertEquals(0,todoService.getAllTodo().size());
    }

    @Test
    void should_return_empty_todo_when_delete_given_1_todo_id() {
        //given
        int todoId = 1;

        //when
        todoService.deleteTodoById(todoId);

        //then
        verify(todoRepository).deleteById(todoId);
    }

    @Test
    void should_return_employee_response_dto_when_add_1_employee_given_1_employee_request_dto() {
        //given
        TodoRequestDto todoRequestDto = new TodoRequestDto("111", false);
        //when
        TodoResponseDto todoResponseDto = todoService.addTodo(todoRequestDto);

        //then
        Assertions.assertEquals("111", todoResponseDto.getContent());
    }

    @Test
    void should_return_new_todo_when_update_given_todo_id_and_todo_request_dto() {
        //given
        int todoId = 1;
        TodoRequestDto todoRequestDto = new TodoRequestDto(1, "111", false);
        when(todoRepository.findById(todoId)).thenReturn(Optional.of(todoRequestDto.toEntity()));
        todoRequestDto.setStatus(true);
        when(todoRepository.save(todoRequestDto.toEntity())).thenReturn(todoRequestDto.toEntity());
        //when
        TodoResponseDto todoResponseDto = todoService.updateTodo(todoRequestDto);
        assertTrue(todoResponseDto.getStatus());

    }
}
