package edu.kh.servlet.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/coffee")
public class ExampleController3 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// TODO Auto-generated method stub1
		String orderer = req.getParameter("orderer");
		String coffee = req.getParameter("coffee");
		String type = req.getParameter("type");
		
		String option = req.getParameter("opt");
		String[] optionArr = req.getParameterValues("opt");
		
		System.out.println("orderer : " + orderer);
		System.out.println("coffee : " + coffee);
		System.out.println("type : " + type);
		System.out.println("option : " + option); //1번째 값만 반환
		System.out.println("optionArr : " + optionArr); //모든값 배열 반환

		if(optionArr != null){
			for(String opt : optionArr){
				System.out.println(opt);
			}
		}
		
	    RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/result2.jsp");
	  
	    dispatcher.forward(req, resp);
	}
}