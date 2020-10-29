<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
<link rel="stylesheet" type="text/css" href="/jspcls/css/w3.css">
<link rel="stylesheet" type="text/css" href="/jspcls/css/cls.css">
<script src="/jspcls/js/jq-3.5.1.js"></script>
<script src="/jspcls/js/Test01"></script>

</head>
<body>
<%!
	String[] color = {"red","lightblue","lightgreen","pink","violet","lightyellow","skyblue","lightgreen","lightblue"};
	
	public String getColor(int idx){
		String scolor = color[idx];
		return scolor;
	}
%>
	
	<img src="/jspcls/img/avatar1"></img>
	<center><h1 class="w3-card-4 w3-blue w3-border w3-button" id="gugu">구구단</h1></center>
	<div class="w3-col w3-hide" id="content">
<%
	for(int i = 0 ; i < 8;  i++){
%>
		<div class="w3-col m3 w3-center" style="background-color: <%=  getColor(i) %> ;"><%= (i+2) + "단" %>

<%
		for(int j = 0 ; j < 9 ; j ++){
%>
				<div class="w3-center"><%= (i+2)+" x "+(j+1)+" = "+(i+2)*(j+1)%></div>
<%
		}
%>
		</div>
<%
	}
%>
	</div>
</body>
</html>