package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex05MakeTable
 */
@WebServlet("/Ex05MakeTable")
public class Ex05MakeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num= Integer.parseInt(request.getParameter("room"));
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<style>");
		out.print("*{font-size: 20pt;}");
		out.print("table{");
		out.print("margin: auto;");
		out.print("width: 200px;");
		out.print("height: 100px;}");
		out.print("tr{text-align: center;}");
		out.print("body{");
		out.print("background-color: aliceblue;}");
		out.print("</style>");
		out.print("<body>");
		out.print("<table border= '2px dashed black'>");
		out.print("<tr>");
		for(int i=1;i<=num;i++) {
			out.print("<td>" + i +"</td>");
		}
		out.print("</tr>");
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
