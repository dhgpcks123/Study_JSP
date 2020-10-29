package day03;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/day03/login.cls")
public class Login extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		//할일
		// 1. 넘겨주는 데이터를 받는다.(생략)
		// 2. 데이터 가공(생략)
		// 3. 데이터를 페이지에 심는다.(생략)
		// 4. 뷰를 부른다.
		String view = "/WEB-INF/views/day03/Login.jsp";
			String sid = "";
			try{
				// 세션에 기록된 데이터를 꺼내는 방법
				HttpSession session = req.getSession(); //세션은 서버메모리에서 만들어짐
				sid = (String) session.getAttribute("SID");
				if(sid != null || sid.length() != 0) {
					view = "/jspcls/main.cls";
					resp.sendRedirect(view);
					return;
				}
			}catch(Exception e) { }
		
		RequestDispatcher rd = req.getRequestDispatcher(view);
		
		//forward방식
		// 처음 요청은 그대로 두고 (url변경없음)
		// 안에 내용만 바꿈.
		try {
			rd.forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
