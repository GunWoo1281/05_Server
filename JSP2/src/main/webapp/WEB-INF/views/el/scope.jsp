<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Servlet/JSP 범위별 내장 객체</title>
</head>
<body>
    <h1>Servlet/JSP 범위(scope)별 내장 객체 + EL 사용법</h1>

    <pre> 
    Servlet/JSP에는 4종류 범위를 나타낸 내장 객체가 존재한다.
    -> 각 종류마다 영향을 끼치는 범위가 달라진다.
    <h3>1. page : 현재 페이지</h3>
    -> 현재 JSP에서만 사용 가능한 객체 (Servlet에서 사용 불가)
    <h3>2. request == HttpServletRequest</h3>
    -> 요청받은 Servlet과 위임받은 페이지(JSP)에서 유지되는 객체
    <h3>3. session (입회, 접속)</h3>
    -> 서버에 접속한 클라이언트를 나타내거나, 관련 정보를 get/set 할 수 있는 객체
        (session 객체는 서버에서 관리함)
    -> session은 브라우저마다 하나씩 생성된다!!!
    -> 사이트 접속 ~ 브라우저 종료 | 세션 시간 만료
    -> 세션이 유지되는 상태에서는 아무곳에서나 session에 세팅된 값을 가져다가 사용할 수 있다 (ex. 로그인 정보)
    <h3>4. application (ServletContext)</h3>
    -> 하나의 웹 어플리케이션마다 1개만 생성되는 객체
    (Server를 키면 1개 생성)
    -> 서버 실행 ~ 서버 종료
    -> application에 세팅된 값을 어디서든 사용 가능.
    </pre>
    <hr><hr>

    <h3>범위별 객체에 세팅된 값(속성) 얻어오기</h3>
    <pre>
        - 범위별 객체에 세팅된 값 얻어오는 EL
        1) \${000Scope.key} -> ex) ${requestScope.key}
        2) \${key}
        -> 좁은 범위 객체부터 탐색하여 일치하는 key가 있으면 얻어옴
    </pre>
    <%
        pageContext.setAttribute("pageValue", "page scope 객체에 세팅한 값");
    %>
    <p> pageScope  : ${pageScope.pageValue} </p>
    <p> requestScope : ${requestScope.requestValue} </p>
    <p> sessionScope : ${sessionScope.sessionValue} </p>
    <p> applicationScope : ${applicationScope.applicationValue} </p>

    <a href="/el/check">객체 범위 확인 페이지로 이동</a>

    <hr>
    <h1>범위별 객체 우선순위 확인</h1>
    <%
        pageContext.setAttribute("menu", "짬짜면(page)");
    %>
    <p>우선순위 menu 출력 : ${menu} </p>
    <h3>원하는 scope의 menu로 세팅된 값 출력</h3>
    <p>pageScope : ${pageScope.menu} </p>
    <p>requestScope : ${requestScope.menu} </p>
    <p>sessionScope : ${sessionScope.menu} </p>
    <p>applicationScope : ${applicationScope.menu} </p>
</body>
</html>