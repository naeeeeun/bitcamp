<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    #wrap{
       	border:2px solid #A2DE8C;
        width:930px;
        display:inline-block;
    }
    
	form{
		width : 900px;
		height : 200px;
		padding : 10px;

	}
    
	.tb1{
		margin:10px;
        float:left;
	}
 	.tb2{
		margin:10px;
        float:right;
	}   
    
    .select{
        margin-right: 20px;
    }
    
	td{
		padding-top:10px;
        margin-right: 10px;
		display:inline-block;
	}
       
	#btn{
		background-color:#86C76E;
		color:white;
		border:1px solid #86C76E;
		margin-left:30px;
        margin-top:80px;
		padding:7px;
		font-weight:bold;       
	}
		
</style>
</head>
<body>
	<div id="wrap">
	<form action="trapi">
		<table class="tb1">
			<tr>
				<td class="select">원본 언어</td>
				<td>
					<select name="source">
						<option value="ko">한국어</option>
						<option value="en">영어</option>
						<option value="zh-CN">중국어</option>
					</select>
				</td>
            </tr>
			<tr>
				<td>문장 입력 : </td>
				<td>
					<textarea rows="5" cols="40" name="txt" style="overflow:hidden">${inputtxt}</textarea>
				</td>			
			</tr>
        </table>
        <input type="submit" value="번역" id="btn">   
		<table class="tb2">
			<tr>
				<td class="select">&nbsp;&nbsp;목적 언어</td>
				<td>
					<select name="target">
						<option value="ko">한국어</option>
						<option value="en">영어</option>
						<option value="zh-CN">중국어</option>
					</select>
				</td>
            </tr>
			<tr>
				<td></td>
				<td>
					<textarea rows="5" cols="40" name="txt" style="overflow:hidden">${result}</textarea>
				</td>				
			</tr>
        </table>
	</form>
    </div>
</body>
</html>