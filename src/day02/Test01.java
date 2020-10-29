package day02;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/day02/Test01.cls")
public class Test01 extends HttpServlet {
	//선언자 방식 요기
	public void service(HttpServletRequest req, HttpServletResponse resp) {
	//스크립트 릿 방식 요기
		String view = "/WEB-INF/views/day02/Test01.jsp";
		
		RequestDispatcher rd = req.getRequestDispatcher(view);
		
		try {
			rd.forward(req, resp);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
