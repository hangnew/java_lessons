<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">첫 페이지로</a>
<hr>
<form action="bbs">
	번호: <input name="bNo"><br>
	제목: <input name="title"><br>
	내용: <input name="content"><br>
	작성자: <input name="writer"><br>
	날짜: <input type="date" name="date"><br>
	<button>게시글 작성</button>
</form>
<a href="bbs?bNo=1&title=testtitle&content=testcontent&writer=testwriter&date=20210827">가보자</a>
</body>
</html>