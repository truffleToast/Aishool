package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex07RadioCheckBox
 */
@WebServlet("/Ex07RadioCheckBox")
public class Ex07RadioCheckBox extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String marry =request.getParameter("marriage");
		System.out.println(marry);
//		String hobby=request.getParameter("hobby");
		// 동일한 name으로 여러개의 데이터를 받는 방법
		String[] hobbys=request.getParameterValues("hobbys");
		for(String hobby: hobbys) { //for-each
			System.out.print(hobby+" ");
		}
	}

}
