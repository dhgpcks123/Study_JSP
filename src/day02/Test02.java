package day02;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/gugudan.cls")
public class Test02 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/WEB-INF/views/day02/Test02.jsp";
		RequestDispatcher rd = req.getRequestDispatcher(view);
		
		try {
			rd.forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}
}
