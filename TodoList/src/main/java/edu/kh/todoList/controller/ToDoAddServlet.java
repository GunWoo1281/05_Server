package edu.kh.todoList.controller;

import java.io.IOException;

import edu.kh.todoList.model.service.TodoListService;
import edu.kh.todoList.model.service.TodoListServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/todo/add")
public class ToDoAddServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			TodoListService service = new TodoListServiceImpl();
			
			String title = req.getParameter("title");
			String detail = req.getParameter("detail");
			
			int result = service.todoAdd(title, detail);
			
			String message = null;
			if(result > 0) 	message = "추가 성공!!!";
			else 			message="추가 실패...";
			
			HttpSession session = req.getSession();
			session.setAttribute("message", message);
			
			//리다이렉트는 무조건 GET방식
			resp.sendRedirect("/");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
