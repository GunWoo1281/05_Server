package edu.kh.servlet.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signUp")
public class ExampleController2 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// TODO Auto-generated method stub1
		String id = req.getParameter("inputId");
		String pw = req.getParameter("inputPw");
		String name = req.getParameter("inputName");
		String intro = req.getParameter("intro");
		
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
		System.out.println("name : " + name);
		System.out.println("intro : " + intro);
		
	    RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/result.jsp");
	
	    dispatcher.forward(req, resp);
	}
}