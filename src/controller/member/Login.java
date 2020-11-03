package controller.member;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ClsMain;

import javax.servlet.http.*;

public class Login implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		//할 일
		//로그인 여부검사
		HttpSession session = req.getSession();
		String sid = (String) session.getAttribute("SID");
		String view="member/Login";
		if(sid == null) {
			//포워드 또는 리다이렉트 설정하고
			req.setAttribute("isRedirect", false);
		}else {
			//이미 로그인 한 경우이다. 메인페이지로 리다이렉트 시킨다.
			req.setAttribute("isRedirect", true);
			view = "/jspcls/main.cls";
		}
		return view;
	}

}
