package controller;

import javax.servlet.http.*;

public class MainController implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("isRedirect", false);
		String view = "main";
//		String view = "/WEB-INF/views/main.jsp";
		return view;
	}
}
