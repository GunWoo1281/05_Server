package edu.kh.todoList.controller;

import java.io.IOException;

import edu.kh.todoList.model.DTO.Todo;
import edu.kh.todoList.model.service.TodoListService;
import edu.kh.todoList.model.service.TodoListServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/todo/update")
public class UpdateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			TodoListService service = new TodoListServiceImpl();

			int todoNo = Integer.parseInt(req.getParameter("todoNo"));
			Todo todo = service.todoDetail(todoNo);
			
			if(todo == null) {
				HttpSession session = req.getSession();
				session.setAttribute("message", "할 일이 존재하지 않습니다");
				resp.sendRedirect("/");
				return;
			}
			
			req.setAttribute("todo",todo);
			req.getRequestDispatcher("/WEB-INF/views/update.jsp").forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			TodoListService service = new TodoListServiceImpl();

			int todoNo = Integer.parseInt(req.getParameter("todoNo"));
			String title = req.getParameter("title");
			String detail = req.getParameter("detail");

			int result = service.todoUpdate(todoNo, title, detail);

			HttpSession session = req.getSession();
			if (result > 0) {
				session.setAttribute("message", "수정 되었습니다");
				resp.sendRedirect("/todo/detail?todoNo=" + todoNo);
			} else {
				session.setAttribute("message", "할 일 수정 실패..");
				resp.sendRedirect("/todo/update?todoNo=" + todoNo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
