package com.example.todolist2.controller;

import com.example.todolist2.mapper.ToDoListMapper;
import com.example.todolist2.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ToDoListController {



    @Autowired
    ToDoListService ts;

    @GetMapping("/list")
    public ArrayList<String> list(){
        return null;
    }

    @GetMapping("/receiveList")
    public ArrayList<String> receiveList(String todo){
        ts.insertTodo(todo);
        return null;
    }

    @GetMapping("/deleteList")
    public ArrayList<String> deleteList(int todo){
        return null;
    }
}
