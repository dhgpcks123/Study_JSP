package day03;

import javax.servlet.annotation.*;
import javax.servlet.http.*;

import java.io.IOException;

import javax.servlet.*;
@WebServlet("/day03/reqblue.cls")
public class ReqBlue extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		
		String view = "/jspcls/day03/reqRed.cls";
		//redirect방식 - 요청 자체를 변경시키는 명령 url이 바뀜.
		//새로운 요청을 서버에게 다시 보내서 다시 응답을 받는거야.
		try {
			//서버에게 새로운 요청을 보내는거야.
			resp.sendRedirect(view);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
