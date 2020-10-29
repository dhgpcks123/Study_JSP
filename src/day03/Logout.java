package day03;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/day03/logout.cls")
public class Logout extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		//할일
		//세션에 기록된 속성을 지운다
		HttpSession session = req.getSession();
		session.removeAttribute("SID");
		
		//리다이렉트 뷰를 부른다.
		String view = "/jspcls/day03/login.cls";
		try {
			resp.sendRedirect(view);
		} catch(Exception e) {}
	}
}
