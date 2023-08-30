package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.MessageDAO;
import com.model.MessageDTO;

/**
 * Servlet implementation class MsgSendService
 */
@WebServlet("/MsgSendService")
public class MsgSendService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String send_name=request.getParameter("send_name");
		String receive_email=request.getParameter("receive_email");
		String message= request.getParameter("message_content");
		MessageDAO dao= new MessageDAO();
		PrintWriter out=response.getWriter();
		
		MessageDTO dto= new MessageDTO(send_name,receive_email,message);
		int cnt =dao.sendMessage(dto);
		String msg= ""; 
		response.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		if (cnt>0) {
			msg ="문자 전송 완료";
		}
		else{
			msg ="문자 전송 실패";
		}
		out.print("<script>alert('"+msg+"');");	
		out.print("location.href='main.jsp#two';");
		out.print("</script>");
			
		
	}

}
