package com.example.todolist.entity;

import com.example.todolist.dto.TodoResponseDto;

import javax.persistence.*;

@Entity
@Table(name = "todoentity")
public class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;
    private boolean status;

    public TodoEntity(int id, String content, boolean statys) {
        this.id = id;
        this.content = content;
        this.status = statys;
    }

    public TodoEntity(String content, boolean statys) {
        this.content = content;
        this.status = statys;
    }

    public TodoEntity() {
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public TodoResponseDto toTodoResponseDto () {
        return new TodoResponseDto(content, status);
    }
}
