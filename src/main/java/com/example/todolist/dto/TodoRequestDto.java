package com.example.todolist.dto;

import com.example.todolist.entity.Todo;

public class TodoRequestDto {
    private int id;
    private String content;
    private Boolean status;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TodoRequestDto(int id, String content, Boolean status) {
        this.id = id;
        this.content = content;
        this.status = status;
    }

    public TodoRequestDto() {
    }

    public TodoRequestDto(String content, Boolean status) {
        this.content = content;
        this.status = status;
    }

    public Todo toEntity() {
        return new Todo(content, status);
    }

    public TodoResponseDto toTodoResponseDto () {
        return new TodoResponseDto(content, status);
    }
}
