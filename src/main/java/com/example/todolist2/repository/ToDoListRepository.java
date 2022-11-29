package com.example.todolist2.repository;


import com.example.todolist2.mapper.ToDoListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ToDoListRepository {

@Autowired
    ToDoListMapper mapper;

public int insertTodo(String todo){
    return mapper.insertTodo(todo);
}


}
