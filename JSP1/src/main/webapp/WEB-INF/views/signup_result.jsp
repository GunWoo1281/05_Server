<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원 가입 결과</title>
</head>
<body>
    <h1>회원 가입 결과 페이지 입니다.</h1>
    <h3>입력되어 전달된 값들</h3>
    <ul>
        <li>아이디 : ${param.inputId}</li>
        <li>비밀번호 : ${param.inputPw}</li>
        <li>비밀번호 확인 : ${param.inputPwCheck}</li>
        <li>이름 : ${param.inputName}</li>
        <li>나이 : ${param.inputAge}</li>
    </ul>
</body>
</html>