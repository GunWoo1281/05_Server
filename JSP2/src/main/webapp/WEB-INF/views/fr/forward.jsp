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
    <h3>request scope 객체를 이용해서 전달받은 값</h3>
    <p>str : ${requestScope.str}</p>
    <h3>파라미터로 전달된 데이터 출력하기</h3>
    <p>첫번째 : ${param.forwardInput1}</p>
    <p>두번째 : ${param.forwardInput2}</p>
    
</body>
</html>