package com.example.todolist2.service;


import com.example.todolist2.repository.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoListService {

    @Autowired
    ToDoListRepository tr;

    public int insertTodo(String todo){
        return tr.insertTodo(todo);
    }
}
