<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
    <style>          
        ul{
            list-style: none;
            border-top:1px solid silver;
            border-bottom:1px solid silver;
            padding:10px;
        }
        ul>li{
            display: inline-block;
            margin-right: 50px;
        }
        a{
        	text-decoration: none;
        	color : black;
        }
        a:visited{
        	color:black;
        }
        div>h3{
        	margin-left : 30px;
        }
    </style>
</head>
<body>
   <header>
       <h1><a href="main.jsp">Open Project</a></h1>
   </header> 
    <ul>
    	<li><a href="regform">회원가입</a></li>
        <li><a href="loginform">로그인</a></li>
        <li><a href="memberlist">회원리스트</a></li>
        <li><a href="board">방명록</a></li>        
        <li><a href="#">사원관리</a></li> 
    </ul>
    
	<form action="login">
		<table>
			<tr>
				<td>아이디(이메일)</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>	
				<td colspan="2" style="text-align: center"><input type="submit" value="login"></td>
			</tr>								
		</table>
	</form>
</body>
</html>