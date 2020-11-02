package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MinController implements MinMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		
		req.setAttribute("isRedirect", false);
		String view="main";
		return view;
	}

}
