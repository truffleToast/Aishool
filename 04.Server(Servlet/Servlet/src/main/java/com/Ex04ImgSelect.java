package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex04ImgSelect
 */
@WebServlet("/Ex04ImgSelect")
public class Ex04ImgSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int user_request = Integer.parseInt(request.getParameter("select"));
		//문자열로 받은걸 숫자로 치환 이유 : equals 쓰기 싫어서 
		response.setCharacterEncoding("EUC-KR"); // 한글 인코딩

		PrintWriter out=response.getWriter();// response 생성자 불러오기
		out.print("<html>");
		out.print("<head>");
		out.print("<body>");
		if (user_request==1) {
			out.print("<img src='img/img.jpg'>");
		}else if(user_request==2){
			out.print("<img src='img/plangkton.jpg'>");
		}else if(user_request==3) {
			out.print("<img src='img/who.jpg'>");
		}else {
			out.print("<p>안녕 안녕</p>");
		}
		out.print("</body>");
		out.print("</head>");
		out.print("</html>");
		
		
	}

}
