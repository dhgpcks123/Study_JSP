package day03;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.*;

import day03.dao.*;

@WebServlet("/day03/loginProc.cls")
public class LoginProc extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		// 할일
		// 1. 파라미터 받고
		String sid = req.getParameter("id"); //넘긴 name값으로 받음.
		String spw = req.getParameter("pw");
		// 2. 데이터베이스에게 질의하고 결과 받고
		MemberDAO mDAO = new MemberDAO();
		int cnt = mDAO.getLoginCnt(sid, spw);
		// 3. 결과에 따라 뷰 정하고
		String view = "/jspcls/main.cls";
		if(cnt != 1) {
			// 이 경우는 로그인에 실패한 경우 -> 로그인 페이지로 다시 이동시킨다.
			view = "/jspcls/day03/login.cls";
		} else {
		//이외의 경우는 로그인에 성공한 경우이므로 메인페이지로 이동시킨다.
			// (일단 생략). 데이터 전달하고
			
			//if에 걸리지 않은 경우는 세션(메모리)에 아이디를 기억시켜 놓는다.
			// 먼저 세션을 꺼내온다.
			HttpSession session = req.getSession();
			// 세션에 데이터 기록하는 방법
			session.setAttribute("SID", sid);
		
		}
		
		// 4. 뷰 보내고
		try {
			resp.sendRedirect(view);
		}catch(Exception e) {
			System.out.println("### 로그인 프로그램 오류 ###");
			e.printStackTrace();
		}
		
		
	}

}
