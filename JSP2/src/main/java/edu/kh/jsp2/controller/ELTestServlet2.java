package edu.kh.jsp2.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/el/scope")
public class ELTestServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//1. page scope -> JSP에서만 확인 가능 ( 딱 1페이지 유효)
		
		//2. request scope -> 요청받은 Servlet과 요청이 위임된 JSP까지, 해당 요청이 끝날 때 까지 유효 (forward)
		//setAttribute("key", value)
		//getAttribute("key")
		req.setAttribute("requestValue","request scope 객체에 세팅한 값");

		//3. session scope -> 클라이언트가 서버에 첫 요청 시, 서버쪽에 생성되는 객체
		HttpSession session = req.getSession();
		session.setAttribute("sessionValue", "session scope 객체에 세팅한 값");
		
		//4. application scope -> 서버 전체에 1개만 존재하는 객체, 서버가 켜져있는 동안 유효한 객체
		ServletContext application = req.getServletContext();
		application.setAttribute("applicationValue", "application scope 객체에 세팅한 값");

		//범위별 우선순위
		//좁은 범위가 우선순위가 더 높다.
		//page > request > session > application

		req.setAttribute("menu","짬뽕(request)");
		session.setAttribute("menu","짜장(session)");
		application.setAttribute("menu","볶음밥(application)");

		//응답처리
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/el/scope.jsp");
		dispatcher.forward(req, resp);
	}
}
