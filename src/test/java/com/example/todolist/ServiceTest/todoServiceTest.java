package com.example.todolist.ServiceTest;

import com.example.repository.TodoRepository;
import com.example.todolist.dto.TodoRequestDto;
import com.example.todolist.service.impl.TodoServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
}
