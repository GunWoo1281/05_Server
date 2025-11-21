package edu.kh.todoList.model.service;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.todoList.model.DTO.Todo;
import edu.kh.todoList.model.dao.TodoListDAO;
import edu.kh.todoList.model.dao.TodoListDAOImpl;

import static edu.kh.todoList.common.JDBCTemplate.*;

public class TodoListServiceImpl implements TodoListService {

	private TodoListDAO dao = new TodoListDAOImpl();
	
	@Override
	public Map<String, Object> todoListFullView() throws Exception{
		
		//자주 쓰는건 static import로 변경하여 메소드만 작성 가능함
		Connection conn = getConnection();
		
		List<Todo> todoList = dao.todoListFullView(conn);
		
		int completeCount = dao.getCompeleteCount(conn);

		Map<String, Object> map = new HashMap<>();
		map.put("todoList", todoList);
		map.put("completeCount", completeCount);

		close(conn);
		return map;
	}

	@Override
	public int todoAdd(String title, String detail) throws Exception {		
		Connection conn = getConnection();
		
		int result = dao.todoAdd(conn, title, detail);
		
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		
		close(conn);
		return result;
	}

	@Override
	public Todo todoDetail(int todoNo) throws Exception {
		
		Connection conn = getConnection();
		
		Todo todo = dao.todoDetail(conn, todoNo);

		close(conn);
		return todo;
	}

	@Override
	public int todoComplete(int todoNo) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.todoComplete(conn, todoNo);
		
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		
		close(conn);
		return result;
	}

	@Override
	public int deleteTodo(int todoNo) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.deleteTodo(conn, todoNo);
		
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
			
		close(conn);
		return result;
	}

	@Override
	public int todoUpdate(int todoNo, String title, String detail) throws Exception {
		Connection conn = getConnection();
		
		int result = dao.updateTodo(conn, todoNo, title, detail);
		if (result > 0) {
			commit(conn);
		}
		else 
			rollback(conn);
		
		close(conn);
		return result;
	}

}
