<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><%=request.getParameter("orderer")%>의 주문결과</title>
</head>
<body>
    <h1>주문자명 : <%=request.getParameter("orderer")%></h1>
    <h3>주문한 커피 : 
        <% if(request.getParameter("type").equals("ice")) { %>
            차가운
        <% } else { %>
            따뜻한
        <% } %>
        <%=request.getParameter("coffee")%>
    </h3>
    <%= request.getParameterValues("opt")%>
    <% if(request.getParameterValues("opt") != null) { %>
        <ul>
            <% for(String opt : request.getParameterValues("opt")) { %>
                <li><%=opt%></li>
            <% } %>
        </ul>
    <% } %>
</body>
</html>