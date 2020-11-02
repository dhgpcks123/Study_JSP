package controller.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ClsMain;

public class TagTest01 implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// 할 일
		//데이터 받을 일 없고 그냥 뷰만 부른다.
		// 이 뷰는 forward 시켜줘야 할 뷰이므로
		req.setAttribute("isRedirect", false);
		String view = "test/foreach01";
		return view;
	}

}
