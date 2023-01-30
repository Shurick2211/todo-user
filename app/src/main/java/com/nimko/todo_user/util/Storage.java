package com.nimko.todo_user.util;

import com.nimko.todo_user.model.Role;
import com.nimko.todo_user.model.ToDo;
import com.nimko.todo_user.model.User;

import java.util.List;

public class Storage {
    public static User user;
    private  List<ToDo> todos;

    public List<ToDo> getTodos() {
        return todos;
    }

    public void setTodos(List<ToDo> todos) {
        this.todos = todos;
    }
}
