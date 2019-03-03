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

    </style>
</head>
<body>
   <header>
       <h1><a href="./">One Sentence</a></h1>
   </header> 
    <ul>
        <li><a href="memberList">회원리스트</a></li>                
    </ul>
    
    <div>
    	<h2>취향분석 기능 구현 (= hashtag list 가져오기)</h2>
    </div>
</body>
</html>