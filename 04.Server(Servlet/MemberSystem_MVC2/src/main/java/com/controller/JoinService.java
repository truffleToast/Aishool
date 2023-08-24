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
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String nickname=request.getParameter("nickname");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String gender=request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("age"));
		System.out.println(nickname+"/"+gender);
		
		//입력받은 정보를 데이터 베이스에 저장
		MemberDAO dao = new MemberDAO();
		dao.join(new MemberDTO(id, pw, nickname, email, phone, gender, age));
		
		//회원가입 후 main.jsp로 이동하기
		response.sendRedirect("main.jsp");
	}

}
