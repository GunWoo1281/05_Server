<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>결과 화면</title>
</head>
<body>
    <%-- JSP 주석 
        <%@ %> : 지시자태그
        <% %> : 스크립틀릿 -> 자바코드 작성
        <%= %> : 표현식/출력식
    --%>
    <h3 style="color: hotpink;"><%= request.getParameter("inputName") %>님의 가입을 환영합니다.</h3>

    <ul>
        <il>id : <%= request.getParameter("inputId") %></il>
        <il>pw : <%= request.getParameter("inputPw") %></il>
    </ul>
    <% if(!request.getParameter("intro").equals("")) {%>
        <h4>자기소개</h4>
        <p><%= request.getParameter("intro") %></p>
    <% } %>
</body>
</html>