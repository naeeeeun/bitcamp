<%@page import="member.MemberInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String userId = request.getParameter("uid");
	String userPw = request.getParameter("upw");
	
	if(userId != null && userPw != null && userId.equals(userPw)) {
		// 로그인 인증 성공
		// Session 속성으로 사용자 정보를 저장
		
		// id 값으로 DB에서 검색 -> 결과가 null이 아니어야 한다.
				// null이면(else) 회원가입이 안된것 ->  history back
		// DB에 있는 pw와 사용자가 입력한 pw 비교 -> 같으면 인증 성공
		// 세션에 사용자 정보를 저장
		
		MemberInfo memberInfo = new MemberInfo();

		memberInfo.setId("cool");
		memberInfo.setName("쿨");
		
		memberInfo.setPassword(""); // 비밀번호는 가져왔지만 보여지지 않도록
		
		session.setAttribute("loginInfo", memberInfo);
		
		response.sendRedirect("mypage.jsp");
		
	} else{
		response.sendRedirect("loginForm.jsp");
	}
		
%>  
  
