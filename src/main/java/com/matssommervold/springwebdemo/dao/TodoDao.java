package com.matssommervold.springwebdemo.dao;

import com.matssommervold.springwebdemo.model.Todo;

import java.util.List;
import java.util.UUID;

public interface TodoDao {

    int insertTodo(UUID id, Todo todo);

    default int addTodo(Todo todo) {
        UUID id = UUID.randomUUID();
        return insertTodo(id, todo);
    }

    List<Todo> selectAllTodos();
}

