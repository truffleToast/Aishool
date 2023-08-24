package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.model.CoffeeDTO;

@WebServlet("/JavaToJson")
public class EX04JavaToJson extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//5개의 커피정보를 보관하는 ArrayList를 생성
	ArrayList<CoffeeDTO> list =new ArrayList<>();
	list.add(new CoffeeDTO("아메리카노", 4000, "Tall"));
	list.add(new CoffeeDTO("콜드브루", 4500, "Tall"));
	list.add(new CoffeeDTO("자바칩 프라푸치노", 6000, "Venti"));
	list.add(new CoffeeDTO("돌체 라떼 아이스", 5000, "Grande"));
	list.add(new CoffeeDTO("피스타치오 아보카도 초콜릿 프라푸치노", 7500, "Venti"));
	
	//Java객체를 -> JSON 데이터로 변환
	Gson gson=new Gson();
	String jsonArr=gson.toJson(list);
	System.out.println(jsonArr);
	response.setContentType("application/json; charset=UTF-8");
	PrintWriter out=response.getWriter();
	out.write(jsonArr);
	
	}

}
