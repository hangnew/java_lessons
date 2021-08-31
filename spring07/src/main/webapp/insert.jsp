<%@page import="com.mega.mvc07.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="dto" class="com.mega.mvc07.MemberDTO"></jsp:useBean>
    <jsp:setProperty property="*" name="dto"/>
    <%
    	MemberDAO dao = new MemberDAO();
    	dao.insert(dto);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원가입 신청 완료
</body>
</html>