package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.front.ICommand;
import com.model.MessageDAO;
import com.model.MessageDTO;

public class MsgSendService implements ICommand{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String send_name = request.getParameter("send_name");
		String receive_email = request.getParameter("receive_email");
		String message = request.getParameter("message_content");
		MessageDAO mdao = new MessageDAO();
		MessageDTO dto = new MessageDTO(send_name, receive_email, message);
		int cnt = mdao.sendMessage(dto);
		
		return "main.jsp#two";
	}
	


			
			

	}


