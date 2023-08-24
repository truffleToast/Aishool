package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginService
 */
@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 세션객체 생성하는 방법
		request.setCharacterEncoding("UTF-8");
		String inputid=request.getParameter("id");
		String inputpw=request.getParameter("pw");
		if (inputid.equals("test") && inputpw.equals("12345")) {
			HttpSession session=request.getSession();
			session.setAttribute("id", inputid);
			/*
			 * 서블릿에서 특정 폴더에 있는 HTML or JSP파일에 접근할경우
			 *  폴더명/파일명.확장자로 정의
			 */			
			response.sendRedirect("ex05_login/Main.jsp");
		}
		else {
			response.sendRedirect("ex05_login/Ex08LoginForm.html");
		}
		
		
	}

}
