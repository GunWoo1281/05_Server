<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>${todo.todoTitle} 상세 조회</title>
	<link rel="stylesheet" href="/resources/css/detail.css">
</head>
<body>

	<h1>${todo.todoTitle}</h1>
		
	<h1></h1>

	<div class="complete">
		완료 여부 : 
		<c:if test="${todo.todoComplete}">
			<span class="green">O</span>
		</c:if>
		<c:if test="${!todo.todoComplete}">
			<span class="red">X</span>
		</c:if>
	</div>

	<div>
		작성일 : ${todo.regDate}
	</div>

	<div class="content">${todo.todoDetail}</div>
		
	<div class="btn-container">
		<div>
			<button type="button" id="goToList">목록으로</button>
		</div>
		
		<div>
			<button id="completeBtn">완료 여부 변경</button>
			<button id="updateBtn">수정</button>
			<button id="deleteBtn">삭제</button>
		</div>
	</div>
	
	<c:if test="${!empty sessionScope.message}">
		<script>
			alert("${sessionScope.message}");
			// JSP 해석순위
			// 1순위 : JAVA(EL,JSTL)
			// 2순위 : Front(HTML,CSS,JS)	
		</script>

		<!-- message를 한 번만 사용하고 제거하기 -->
		<c:remove var="message" scope="session"/>
	</c:if>
	<script src="/resources/js/detail.js"></script>
</body>
</html>