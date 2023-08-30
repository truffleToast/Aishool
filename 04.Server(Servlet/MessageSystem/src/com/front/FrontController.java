package com.front;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.MemberDAO;
import com.model.MemberDTO;
import com.model.MessageDAO;
import com.model.MessageDTO;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. client가 요청한 url 가져오기
		String uri = request.getRequestURI();
		System.out.println(uri);
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		// 2. Context Path(웹 어플리케이션의 시작 주소)
		String contextPath = request.getContextPath();
		String command = uri.substring(contextPath.length() + 1);
		MemberDAO dao = new MemberDAO();
		MessageDAO mdao = new MessageDAO();
		response.setContentType("text/html;charset=UTF-8");

		// switch 잘 쓸줄 몰라서 이걸로 연습
		switch (command) {
		case "JoinService.do": {
			// 회원가입 기능 구현
			System.out.println("회원가입 기능 실행");
			// 1. email, pw, phone, addr 값을 콘솔에 출력
			String email = request.getParameter("email");
			String pw = request.getParameter("pw");
			String phone = request.getParameter("phone");
			String addr = request.getParameter("addr");
			// System.out.println(email+"\n"+ pw+"\n"+ phone+"\n"+ addr);
			MemberDTO dto = new MemberDTO(email, pw, phone, addr);
			int cnt = dao.join(dto);
			if (cnt != 0)
				System.out.println("회원가입 성공!");
			else {
				System.out.println("회원가입 실패!");
			}
			response.sendRedirect("main.jsp");
			break;
		}
		case "LoginService.do": {
			// 로그인 기능 구현
			String email = request.getParameter("email");
			String pw = request.getParameter("pw");
			MemberDTO dto = new MemberDTO(email, pw);
			MemberDTO info = dao.login(dto);
			if (info != null) {
				System.out.println(info.toString());
				HttpSession session = request.getSession();
				session.setAttribute("info", info);
			} else {
				System.out.println("로그인실패");
			}
			response.sendRedirect("main.jsp");
			break;
		}
		case "LogOutService.do": {
			// 로그아웃 서비스
			HttpSession session = request.getSession();
			session.invalidate();
			response.sendRedirect("main.jsp");
			break;
		}
		case "UpdateService.do": {
			// 회원정보 수정 서비스
			HttpSession session = request.getSession();
			MemberDTO info = (MemberDTO) session.getAttribute("info");
			String pw = request.getParameter("pw");
			String phone = request.getParameter("phone");
			String addr = request.getParameter("addr");
			MemberDTO newInfo = new MemberDTO(info.getEmail(), pw, phone, addr);
			int cnt = dao.update(newInfo);
			if (cnt != 0) {
				// 세션영역의 수정된 회원정보를 저장, main.jsp로 이동
				session.setAttribute("info", newInfo);
				response.sendRedirect("main.jsp");
			} else {
				response.sendRedirect("update.jsp");
			}
			break;
		}
		case "MsgSendService.do": {
			// 메세지보내기
			String send_name = request.getParameter("send_name");
			String receive_email = request.getParameter("receive_email");
			String message = request.getParameter("message_content");
			MessageDTO dto = new MessageDTO(send_name, receive_email, message);
			int cnt = mdao.sendMessage(dto);
			String msg = "";
			if (cnt > 0) {
				msg = "문자 전송 완료";
			} else {
				msg = "문자 전송 실패";
			}
			out.print("<script>alert('" + msg + "');");
			out.print("location.href='main.jsp#two';");
			out.print("</script>");
			break;
		}
		case "MsgDelete.do": {
			// 메세지 개별삭제
			String num = request.getParameter("num");
			int ch_num = Integer.parseInt(num);
			mdao.delete(ch_num);
			response.sendRedirect("main.jsp#two");
			break;
		}
		case "MsgAllDelete.do": {
			// 메세지 전체삭제
			HttpSession session = request.getSession();
			MemberDTO info = (MemberDTO) session.getAttribute("info");
			String email = info.getEmail();
			mdao.allDelete(email);
			response.sendRedirect("main.jsp#two");
			break;
		}
		default:
			// 잘못된 접근일 경우 이전 페이지로
			out.print("<script>" + "alert('잘못된 접근입니다.');" + "history.back();" + "</script>");
			break;

		}
	}
}
