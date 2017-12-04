<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<hr width="500">
	<table width = "600" cellpadding="0" cellspacing="0" border="1">
		<colgroup bgcolor ="#ddffaa">
			<col width="10%">
			<col width="70%">
			<col width="20%">			
		</colgroup>
		
		<tr>
			<td align="center">番号</td>
			<td align="center">タイトル</td>
			<td align="center">作成人</td>
			
		</tr>
		<c:forEach items="${list}" var="vo">
		<tr bgcolor="white">
			<td>${vo.bId}</td>
			<td>${vo.bContent}</td>
			<td>${vo.bName}</td>
		</tr>
		</c:forEach>
	</table>
	<a href="writeForm">書き込み</a>
</div>
</body>
</html>