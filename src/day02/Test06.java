package day02;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/img/avatar1")
public class Test06 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
	String view = "/WEB-INF/resources/img/avatar/img_avatar1.png";
	RequestDispatcher rd = req.getRequestDispatcher(view);
	
	try {
		rd.forward(req, resp);
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
