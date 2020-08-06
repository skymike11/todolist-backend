package com.example.todolist.entity;

import javax.persistence.*;

@Entity
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;
    private boolean statys;

    public Todo(int id, String content, boolean statys) {
        this.id = id;
        this.content = content;
        this.statys = statys;
    }

    public Todo(String content, boolean statys) {
        this.content = content;
        this.statys = statys;
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

    public boolean isStatys() {
        return statys;
    }

    public void setStatys(boolean statys) {
        this.statys = statys;
    }
}
