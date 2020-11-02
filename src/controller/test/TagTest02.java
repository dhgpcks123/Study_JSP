package controller.test;

import javax.servlet.http.*;
import java.util.*;

import controller.*;


public class TagTest02 implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("isRedirect", false);
		//데이터 만들고
		ArrayList list = new ArrayList();
		
		list.add("이지우");
		list.add("장성환");
		list.add("오혜찬");
		list.add("유병욱");
		list.add("윤요셉");
		list.add("박진우");
		list.add("김영선");
		list.add("권영선");
		list.add("김주영");
		list.add("장수진");
		//데이터 넘겨주고
		req.setAttribute("LIST", list);
		
		return "test/foreach02";
	}

}
