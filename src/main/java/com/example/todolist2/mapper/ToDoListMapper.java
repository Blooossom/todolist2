package com.example.todolist2.mapper;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface ToDoListMapper {

    public int insertTodo(String todo);
    // public String selectExample();
    //인터페이스와 xml의 일대일대응, xml의 매퍼의 경로, mapper의 id 가 메서드명, resulttype이 반환타입
}
