package day04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/day04/rdrtTest.cls")
public class Test01_01 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		
		
		// 할일
		// 이 요청이 오면 /day04/fwdTest.cls로 요청을 바꿔서 응답해주자.
		
		//만약 파라미터를 넘겨야 하는 경우는 릴레이를 해줘야 한다.
		String view = "/jspcls/day04/fwdTest.cls?id="+req.getParameter("id")
					+"&pw="+req.getParameter("pw");
		// 이 때 이 작업을 가리키는 용어가 파라미터 릴레이 라고 한다.
		try {
			resp.sendRedirect(view);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}