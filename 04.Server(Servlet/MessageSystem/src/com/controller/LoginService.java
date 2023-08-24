package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.MemberDAO;
import com.model.MemberDTO;

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
		// 필요한 데이터 이메일, pw
		request.setCharacterEncoding("UTF-8");
		String email=request.getParameter("email");
		String pw=request.getParameter("pw");
		
		MemberDAO dao=new MemberDAO();
		MemberDTO dto=new MemberDTO(email, pw);
		MemberDTO info= dao.login(dto);
		if (info!= null) {
			System.out.println(info.toString());
			HttpSession session=request.getSession();
			session.setAttribute("info",info);

		}else {
			System.out.println("로그인실패");
			
		}
		response.sendRedirect("main.jsp");
	}

}
