package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.MemberDAO;
import com.model.MemberDTO;

/**
 * Servlet implementation class JoinService
 */
@WebServlet("/JoinService")
public class JoinService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1. email, pw, phone, addr 값을 콘솔에 출력
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String email= request.getParameter("email");
		String pw= request.getParameter("pw");
		String phone= request.getParameter("phone");
		String addr= request.getParameter("addr");
		//System.out.println(email+"\n"+ pw+"\n"+ phone+"\n"+ addr);
		
		MemberDAO dao=new MemberDAO();
		MemberDTO dto=new MemberDTO(email, pw, phone, addr);
		int cnt =dao.join(dto);
		 
		if(cnt!=0) 
			System.out.println("회원가입 성공!");
		else {
			System.out.println("회원가입 실패!");
		}
		response.sendRedirect("main.jsp");
	}

}
