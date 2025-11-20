package edu.kh.todoList.model.dao;

import java.sql.Connection;
import java.util.List;

import edu.kh.todoList.model.DTO.Todo;

public interface TodoListDAO{

	List<Todo> todoListFullView(Connection conn) throws Exception;

	int getCompeleteCount(Connection conn) throws Exception;

}
