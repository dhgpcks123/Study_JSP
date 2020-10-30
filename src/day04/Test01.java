package day04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/day04/fwdTest.cls")
public class Test01 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		// 할일
		// 1. 뷰를 부른다.
		String view = "/WEB-INF/views/day04/Test01.jsp";
		RequestDispatcher rd= req.getRequestDispatcher(view);
		try {
			rd.forward(req,  resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
