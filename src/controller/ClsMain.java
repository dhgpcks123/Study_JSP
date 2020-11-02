package controller;

import javax.servlet.http.*;

/**
 * @author 오혜찬
 * @since 2020.11.02
 * @version v.1.0
 *
 */


public interface ClsMain {
	/* 이 클래스는 디스패치 컨트롤러에서 요청을 처리할 때 사용할 클래스들의
	* 다형성 구현을 위해서 만들어진 인터페이스....
	* 예 ]
			* 		Login implements ClsMain{}
			* 	
			* 		ClsMain c1 = new Login();
			* 		
			* 		이 때
			* 			c1.exec(req, resp); -> Login쪽에 구현한 exec함수를 실행하게 될 것이다.
			* 									Login.exec(req, resp)
	*/
	String exec(HttpServletRequest req, HttpServletResponse resp);
	//인터페이스 안에 모든 추상함수는 자동으로 public abstract final이 붙음 
}
