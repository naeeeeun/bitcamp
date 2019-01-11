<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%request.setCharacterEncoding("utf-8"); %>

<!-- 빈즈 객체 생성 -->
<jsp:useBean id="memberInfo" class="member.MemberInfo"/>

<!-- 사용자 입력 데이터 받기 -->
<!-- 빈즈 클래스의 변수 이름과 폼 name 속성의 값이 같아야 함 -->
<jsp:setProperty property="*" name="memberInfo"/>
<jsp:setProperty property="password" name="memberInfo"
value="<%=memberInfo.getId() %>"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="400" border="1" cellpadding="0" cellspacing="0">
	<tr>
	<td>아이디</td>
	<td><jsp:getProperty name="memberInfo" property="id"/></td><br>
		<input type="text" id="uid" name="id" value="<%=memberInfo.getId()%>">
	
	<td>암호</td>
	<td><jsp:getProperty name="memberInfo" property="password"/>
	</td>	
	</tr>
	<tr>
	<td>이름</td>
	<td><jsp:getProperty name="memberInfo" property="name"/>
	<!-- EL사용 : ${memberInfo.name} -->
	
	</td>
	<td>이메일</td>
	<td><jsp:getProperty name="memberInfo" property="email"/></td>	
	</tr>
	<tr>
	<td>주소</td>
	<td colspan="3">
	<jsp:getProperty name="memberInfo" property="address"/>
	</td>	
	</tr>		
	</table>
</body>
</html>