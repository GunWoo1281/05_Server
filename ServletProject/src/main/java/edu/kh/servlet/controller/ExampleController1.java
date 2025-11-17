package edu.kh.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ExampleController1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException  {
		
		System.out.println("--- 이름, 나이를 입력받아 처리하는 서블릿 코드 ---");
		System.out.println(req.getParameter("inputName"));
		System.out.println(req.getParameter("inputAge"));
		
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<!DOCTYPE html>");
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>서버 응답 페이지</title>");		
		sb.append("</head>");
		
		sb.append("<body>");
		sb.append("<h1>응답페이지 입니다</h1>");
		sb.append("<p>입력 받은 이름 : " + req.getParameter("inputName") + "</p>");
		sb.append("<p>입력 받은 나이 : " + req.getParameter("inputAge") + "</p>");
		sb.append("</body>");
		
		sb.append("</html>");
		
		out.write(sb.toString());
	}
	
}