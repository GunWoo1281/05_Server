<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h3>/fr/redirect 요청 시 재요청 되어 보여지는 페이지</h3>
    <h3>request scope로 전달된 값이 존재하는지 확인</h3>
    <ul>
        <li>str2 : ${requestScope.str2}</li>
        <li>redirectInput1 : ${param.redirectInput1}</li>
        <li>redirectInput2 : ${param.redirectInput2}</li>
    </ul>
    <h3>session scope로 전달된 값 : ${sessionScope.sessionNum}</h3>
</body>
</html>