<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/jspcls/resources/css/w3.css">
</head>
<body>
	<h1 style="background-color: purple;"><center>스크립트 릿 방식 테스트</center></h1>
	
<%! //선언자방식
	String[] color = {"#98FB98","#90EE90","#00FA9A","#00FF7F","#3CB371",
						"#2E8B57","#228B22","#008000","#008B8B","#AA22BB"};
	public String getColor(int idx){
		String scolor = color[idx];
		return scolor;
	}
%>
<% //스크립트 릿
	for(int i = 0 ; i < 10; i++){	
%>
	<h3 style="display: inline-block; width: 200px; height: 100px; background-color: <%= getColor(i) %>;"></h3>
<%
	}
%>
</body>
</html>