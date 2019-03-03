<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>    
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
        
        table{
        	border:1px solid silver;     
        	border-collapse: collapse;   	
        }
        
        td{
        	border:1px solid silver;
        	padding:10px;
        }
    </style>
</head>
<body>
   <header>
       <h1><a href="../../one">One Sentence</a></h1>
   </header> 
    <ul>
        <li><a href="memberList">회원리스트</a></li>    
    </ul>  
	<h1>회원리스트</h1>
	<table>
		<c:forEach items="${memberlist}" var="member">
			<tr>
				<td>${member}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
