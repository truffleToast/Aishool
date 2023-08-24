package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EX01Mypage
 */
@WebServlet("/EX01Mypage")
public class Ex01Mypage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	// 응답객체에 인코딩을 적용
	
	
	//web Page에 Text 및 Tag를 사용하기 위해서는 Out 객체 필요
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("EUC-KR");
		// 요청하기
		String ip =request.getRemoteAddr();
		
		System.out.println(ip);
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		if(ip.equals("192.168.0.101") ){
			out.print("<h1> 충현님환영해요~ </h1>");
			out.print("<img src='img.jpg'>");
		}
		else if(ip.equals("http://192.168.0.59")) {
			out.print("<h1>  선생님 환영해요~ </h1>");
			out.print("<img src='img.jpg'>");
		}else {
			out.print("<h1> 아뇨 뚱인데요 </h1>");
			out.print("<img src='who.jpg'>");
		}
		
		out.print("</body>");
		out.print("</html>");
	}
}
