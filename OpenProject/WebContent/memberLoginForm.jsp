<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
</head>
<body>
	<form action="/OpenProject/memberLogin.jsp">
		<table>
			<tr>
				<td>아이디(이메일)</td>
				<td><input type="text" name="uid"></td>
			</tr>
			<tr>			
				<td>비밀번호</td>
				<td><input type="password" name="upw"></td>
			</tr>	
			<tr>			
				<td><input type="submit" value="로그인"></td>
			</tr>								
		</table>
	
	</form>
</body>
</html>