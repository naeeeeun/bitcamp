<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 폼</title>
</head>
<body>
	<form action="/OpenProject/memberReg.jsp" method="post">
		<table>
			<tr>
				<td>아이디(이메일)</td>
				<td><input type="text" name="rid"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="rpw"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="rname"></td>
			</tr>
			<tr>
				<td>사진</td>
				<td></td>
			</tr>
			<tr>
				<td><input type="submit" value="등록"></td>
			</tr>								
		</table>
	</form>	
</body>
</html>