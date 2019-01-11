<%@page import="member.MemberInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // login.jsp에서 session에 setAttribute에 loginInfo라는 이름으로 저장
    // getAttribute 반환 : String타입으로 반환하므로 형변환 필요 
	MemberInfo memberInfo = (MemberInfo)session.getAttribute("loginInfo");
    
    //memberInfo 있으면 로그인 되어있는거(true), 없으면 로그인 안되어있는거(false)
    boolean login = memberInfo == null ? false : true;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mypage</title>
</head>
<body>
	<%
		if(login){
			%>
			<h3><a href="logout.jsp">로그아웃</a></h3>			
			<h2><%=memberInfo.getName()%>(<%=memberInfo.getId()%>)님 안녕하세요.</h2>	
			<h2>${loginInfo.name}(${loginInfo.id})님 안녕하세요.</h2>		
			<% 
		}else{
			%>			
			<h2> 회원 전용 페이지 입니다. <a href="loginForm.jsp">로그인 하기</a></h2>			
			<%
		}
	%>
</body>
</html>