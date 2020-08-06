package com.example.todolist.dto;

public class TodoResponseDto {
    private String content;
    private boolean status;

    public TodoResponseDto(String content, boolean status) {
        this.content = content;
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public TodoResponseDto() {
    }

}
