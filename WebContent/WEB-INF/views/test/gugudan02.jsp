<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="/jspcls/css/w3.css">
	<link rel="stylesheet" type="text/css" href="/jspcls/css/cls.css">
	<script type="text/javascript" src="/jspcls/js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript" src="/jspcls/js/"></script>
	</head>

	<body>
		<h1 class="w3-center w3-container w3-card-4 w3-amber">ForEach 구구단</h1>
		
		<c:forEach var="i" begin="2" end="9" step="1">
				<div class=" w3-col m3 w3-content w3-border" style="display:inline-block;">
				<div class="w3-center w3-${LIST.get(i-2)}">${i}단</div>
			<c:forEach var="j" begin="2" end="9" step="1" >
				<div class="w3-center">${i} x ${j} = ${i*j}</div>
			</c:forEach>
				</div>
		</c:forEach>
		
		
	</body>
</html>