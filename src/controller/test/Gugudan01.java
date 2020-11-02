package controller.test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ClsMain;

public class Gugudan01 implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {

		req.setAttribute("isRedirect", false);
		String view = "test/gugudan01";
		return view;
	}

}
