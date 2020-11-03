package com.increpas.cls.controller.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;

public class LoginProc implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		//뷰 요청방식
		req.setAttribute("isRedirect", true);
		
		String view ="jspcls/main.cls";
		
		
		
		
		return view;
	}

}
