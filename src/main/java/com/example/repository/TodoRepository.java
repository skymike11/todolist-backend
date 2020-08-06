package com.example.repository;

import com.example.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}