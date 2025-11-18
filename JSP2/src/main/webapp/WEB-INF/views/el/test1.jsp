<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EL 확인 1</title>
</head>
<body>
    <h3>전달받은 파라미터 출력하기</h3>
    <pre>
        - \${param.key} : key 일치하는 파라미터 얻어오기
        - \${paramValues.key} : key 일치하는 파라미터 모두 얻어오기(배열)
    </pre>
    <ul>
        <!-- 자동형변환 -->
        <li>${param.str == "abc"}</li>
        <li>${param.intNum == 100}</li>
        <li>${param.doubleNum == 3.14}</li>
    </ul>
    <hr>
    <h3>같은 key값을 지닌 파라미터 얻어오기</h3>
    <ul>
        <li>param.check : ${param.check}</li>
        <li>paramValues.check : ${paramValues.check}</li>
        <li>paramValues.check[0] : ${paramValues.check[0]}</li>
        <li>paramValues.check[1] : ${paramValues.check[1]}</li>
        <li>paramValues.check[2] : ${paramValues.check[2]}</li>
    </ul>
</body>
</html>