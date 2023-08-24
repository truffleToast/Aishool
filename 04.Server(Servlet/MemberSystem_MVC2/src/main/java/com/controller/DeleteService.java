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
 * Servlet implementation class deleteService
 */
@WebServlet("/deleteService")
public class DeleteService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	MemberDAO dao= new MemberDAO();
	MemberDTO dto= new MemberDTO(id, pw);
	int cnt=dao.delete(dto);
	if (cnt!=0) {
		response.sendRedirect("main.jsp");
	}
	else {
	response.sendRedirect("delete.jsp");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	}
	
	
	
	
	}

}
