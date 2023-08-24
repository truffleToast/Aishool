package com.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.MemberDAO;


@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
   private static final long serialVersionUID = 1L;

   
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      
      //포스트방식의 전송방식이므로
      request.setCharacterEncoding("UTF-8");
      
      //사용자가 입력한 가져오기 (id, pw)
      
       String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        String nick = null;
       
        
        //id,pw를 이용해서 데이터베이스 조회하기
        //데이터가 있다면 nick데이터 가져오기
                
        MemberDAO dao = new MemberDAO(); 
        
        nick = dao.login(id, pw);
        
        if(nick != null){
          //로그인 성공
          nick =URLEncoder.encode(nick, "UTF-8");
           response.sendRedirect("loginSuccess.jsp?nick="+nick);
        }
        else{
          //로그인 실패
          response.sendRedirect("login.jsp"); 
        }
      
   }

}