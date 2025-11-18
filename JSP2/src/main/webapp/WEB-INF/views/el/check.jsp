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
    <h3> pageScope  : ${pageScope.pageValue} </h3>
    <h3> requestScope : ${sessionScope.requestValue} </h3>
    <h3> sessionScope : ${sessionScope.sessionValue} </h3>
    <h3> applicationScope : ${applicationScope.applicationValue} </h3>
</body>
</html>