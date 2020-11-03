package controller.ajax;

import javax.servlet.http.*;

import controller.ClsMain;

import controller.*;

public class Test01 implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("isRedirect", null);
		
		StringBuffer buff = new StringBuffer();
		buff.append("{");
		buff.append("\"name\": \"이지우\",");
		buff.append("\"age\": \"26\",");
		buff.append("\"gen\": \"남자\"");
		buff.append("}");
		
		return buff.toString();
	}

}
