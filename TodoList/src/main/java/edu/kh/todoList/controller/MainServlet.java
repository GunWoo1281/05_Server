package edu.kh.todoList.controller;

import java.util.List;
import java.io.IOException;
import java.util.Map;

import edu.kh.todoList.model.DTO.Todo;
import edu.kh.todoList.model.service.TodoListService;
import edu.kh.todoList.model.service.TodoListServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class MainServlet extends HttpServlet {

	//여기서 바로 위임해서 표현하는 이유는 DB에서 데이터를 얻어와야하기 때문에
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 //요청 -> controller -> Service -> DAO -> DB
		 //응답 <-  views(jsp)<-         <-       <-
		try {
			TodoListService service = new TodoListServiceImpl();
			
			//전체 할일, 완료 Todo 갯수를 구해오기.
			Map<String, Object> map = service.todoListFullView();

			List<Todo> todoList = (List<Todo>)map.get("todoList");
			int completeCount = (int)map.get("completeCount");
			
			req.setAttribute("todoList", todoList);
			req.setAttribute("completeCount", completeCount);
			
			req.getRequestDispatcher("/WEB-INF/views/main.jsp").forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}