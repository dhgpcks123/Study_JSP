package controller.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ClsMain;
import java.util.*;

public class Gugudan02 implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		
		req.setAttribute("isRedirect", false);
		
		ArrayList list = new ArrayList();
		list.add("blue");
		list.add("red");
		list.add("green");
		list.add("amber");
		list.add("aqua");
		list.add("white");
		list.add("blue");
		list.add("red");
		list.add("green");
		req.setAttribute("LIST", list);
		
		return "test/gugudan02";
	}

}
