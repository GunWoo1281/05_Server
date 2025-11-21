package edu.kh.todoList.model.dao;

import java.sql.Connection;
import java.util.List;

import edu.kh.todoList.model.DTO.Todo;

public interface TodoListDAO{

	List<Todo> todoListFullView(Connection conn) throws Exception;

	int getCompeleteCount(Connection conn) throws Exception;

	int todoAdd(Connection conn, String title, String detail) throws Exception;

	Todo todoDetail(Connection conn, int todoNo) throws Exception;

	int todoComplete(Connection conn, int todoNo) throws Exception;

	int deleteTodo(Connection conn, int todoNo) throws Exception;

	int updateTodo(Connection conn, int todoNo, String title, String detail) throws Exception;

}
