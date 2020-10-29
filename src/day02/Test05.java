package day02;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/js/Test01")
public class Test05 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/WEB-INF/resources/js/Test01.js";
		RequestDispatcher rd = req.getRequestDispatcher(view);
		
		try {
			rd.forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("javascript연결 요청 들어왔습니다");


	}

}