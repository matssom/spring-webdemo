package com.matssommervold.springwebdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Todo {

    private final UUID id;
    private final String todo;
    private boolean done;


    public Todo(@JsonProperty("id") UUID id, @JsonProperty("todo") String todo) {
        this.id = id;
        this.todo = todo;
        this.done = false;
    }

    public UUID getId() {
        return id;
    }

    public String getTodo() {
        return todo;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
