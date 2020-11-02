package dispatch;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;
import java.io.*;

import controller.*;

@WebServlet("*.min")
public class MinDispatch extends HttpServlet {
	private HashMap<String, MinMain> map;
	
	
	public void init(ServletConfig config) throws ServletException {
		Properties prop = new Properties();
		FileInputStream fin = null;
		
		try {
			String spath = this.getClass().getResource("").getPath();
			System.out.println(".min spath : "+spath);
			fin = new FileInputStream(spath+"../resources/minProperties.properties");
			prop.load(fin);
			System.out.println("파일 읽어오기 : " + prop.get("test"));
		} catch (Exception e) {
			System.out.println("### .min init 실패");
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			}catch(IOException e) {}
		}
		
		
		map = new HashMap<String, MinMain>();
		Set set = prop.keySet();
		ArrayList list = new ArrayList(set);
		for(Object o : list) {
			String skey = (String) o;
			String classPath = (String) prop.get(skey);
			System.out.println("classPath : "+ classPath);
			try {
				Class tmp = Class.forName(classPath);
				System.out.println("tmp : "+ tmp);
				MinMain min =(MinMain)tmp.newInstance();
				map.put(skey, min);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String full = req.getRequestURI();
		System.out.println("클라이언트 요청 URI : " + full);
		String realPath = full.substring(full.indexOf('/',1));
		System.out.println("realPath :" + realPath );
		MinMain min = map.get(realPath);
		
		System.out.println("map.get :" + min );
		Boolean bool = null;
		String view = min.exec(req, resp);
		try {
			bool = (Boolean)req.getAttribute("isRedirect");
		} catch (Exception e) {}
		
		if(bool == null) {
			PrintWriter pw = resp.getWriter();
			pw.print(view);
		} else if(bool) {
			resp.sendRedirect(view);
		} else if(!bool) {
			String prefix = "/WEB-INF/views/";
			String surffix = ".jsp";
			RequestDispatcher rd = req.getRequestDispatcher(prefix+view+surffix);
			rd.forward(req, resp);
		}
	}
	
	
}
