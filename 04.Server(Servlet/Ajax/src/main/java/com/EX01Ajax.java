package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EX01Ajax
 */
@WebServlet("/ajax")
public class EX01Ajax extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String data= request.getParameter("data");
		String data2= request.getParameter("data2");
		System.out.println("서버에 요청이 들어옴");
		System.out.println("넘겨받은 데이터:"+ data +","+ data2);
		//요청한 곳으로 데이터 보내주기
		PrintWriter out=response.getWriter();
		//out.print("data=success!&data2=1234");
		//JSON 형식으로 데이터 응답하기
		//JSON형식: {"data":"Hello","num":1234, "bool":true,...}
		// -key는 반드시 문자열로 정의해야한다.
		out.print("{\"data\":\"Hello\", \"num\":1234}");
		
		
		
	}

}
