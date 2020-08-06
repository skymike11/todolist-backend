package com.example.todolist.entity;

import com.example.todolist.dto.TodoResponseDto;

import javax.persistence.*;

@Entity
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;
    private boolean status;

    public Todo(int id, String content, boolean statys) {
        this.id = id;
        this.content = content;
        this.status = statys;
    }

    public Todo(String content, boolean statys) {
        this.content = content;
        this.status = statys;
    }

    public Todo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public TodoResponseDto toTodoResponseDto () {
        return new TodoResponseDto(content, status);
    }
}
