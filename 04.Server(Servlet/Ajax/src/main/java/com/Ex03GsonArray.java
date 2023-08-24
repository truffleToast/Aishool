package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class Ex03GsonArray
 */
@WebServlet("/GsonArray")
public class Ex03GsonArray extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//JSONArray객체생성
//		JsonArray jsonArr =new JsonArray();
//		jsonArr.add("Json배열");
//		jsonArr.add(1234);
//		jsonArr.add(true);
//		
//		System.out.println(jsonArr);
		
		JsonArray jsonArr2 =new JsonArray();
		
		JsonObject jsonObj1=new JsonObject();
		JsonObject jsonObj2=new JsonObject();
		JsonObject jsonObj3=new JsonObject();
		
		//상품정보를 JSON객체로 구현하기
		jsonObj1.addProperty("name", "americano");
		jsonObj1.addProperty("price", 2000);
		
		jsonObj2.addProperty("name", "caffelatte");
		jsonObj2.addProperty("price", 2500);
		
		jsonObj3.addProperty("name", "banillarlatte");
		jsonObj3.addProperty("price", "2500");
		
		//JSON객체를 JSONArray객체에 저장하기
		jsonArr2.add(jsonObj1);
		jsonArr2.add(jsonObj2);
		jsonArr2.add(jsonObj3);
		
		response.setContentType("application/json; , charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.print(jsonArr2);
	}

}
