package com.matssommervold.springwebdemo.service;

import com.matssommervold.springwebdemo.dao.TodoDao;
import com.matssommervold.springwebdemo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoDao todoDao;

    @Autowired
    public TodoService(@Qualifier("fakeDao") TodoDao todoDao) { // Dependency injection
        this.todoDao = todoDao;
    }

    public int addTodo (Todo todo) {
        return todoDao.addTodo(todo);
    }

}
