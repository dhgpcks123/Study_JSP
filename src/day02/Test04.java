package day02;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/js/jq-3.5.1.js")
public class Test04 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/WEB-INF/resources/js/jquery-3.5.1.min.js";
		RequestDispatcher rd = req.getRequestDispatcher(view);
		
		try {
			rd.forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("jQuery-3.5.1 요청 들어왔습니다");


	}

}