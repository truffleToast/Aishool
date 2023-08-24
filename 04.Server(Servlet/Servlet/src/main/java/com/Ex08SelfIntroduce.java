package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex08SelfIntroduce
 */
@WebServlet("/Ex08SelfIntroduce")
public class Ex08SelfIntroduce extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=UTF-8");
	response.setCharacterEncoding("UTF-8");
	String id=request.getParameter("id");
//	String pw=request.getParameter("pw");
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String tel=request.getParameter("tel");
	String gender=request.getParameter("gender");
	String[] hobbies=request.getParameterValues("hobbies");
	String birthday=request.getParameter("birthday");
	String color=request.getParameter("color");
	String country=request.getParameter("country");
	String talk=request.getParameter("talk");
	PrintWriter out=response.getWriter();
	out.print("<html>");
	out.print("<body>");
	out.print("<p> ID:"+id+"</p>");
	out.print("<p>NAME:"+name+"</p>");
	out.print("<p>EMAIL:"+email+"</p>");
	out.print("<p>TEL:"+tel+"</p>");
	out.print("<p>GENDER:"+gender+"</p>");
	out.print("<p>COUNTRY:"+country+"</p>");
	out.print("<p>BIRTHDAY:"+birthday+"</p>");
	out.print("<p>COLOR:"+color+"</p>");
	String h1="";
	for(String hobby: hobbies) {
		h1+=hobby+" ";
	}
	out.print("<span> Hobby: " +h1+ "</span>");
	out.print("<p>TALK:"+talk+"</p1>");
	out.print("</body>");
	out.print("</html>");
	
//	System.out.println(id);
//	System.out.println(pw);
//	System.out.println(name);
//	System.out.println(email);
//	System.out.println(tel);
//	System.out.println(gender);
//	for(String hobby : hobbies) {
//		System.out.print(hobby+" ");		
//	}
//	System.out.println(birthday);
//	System.out.println(color);
//	System.out.println(country);
//	System.out.println(talk);
	
	
	
	
	
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}

}
