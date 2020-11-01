package com.matssommervold.springwebdemo.dao;

import com.matssommervold.springwebdemo.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao") // Instanciated by spring
public class FakeTodoDataAccessService implements TodoDao {

    private static List<Todo> DB = new ArrayList<>();

    @Override
    public int insertTodo(UUID id, Todo todo) {
        DB.add(new Todo(id, todo.getTodo()));
        return 0;
    }

    @Override
    public List<Todo> selectAllTodos() {
        return DB;
    }

}
