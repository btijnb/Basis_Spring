<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>掲示板リスト</title>
</head>
<body>
<div align="center">
	<h2>掲示板リスト</h2>
	<hr width="400" color="red"/>
	
	<table border="1" cellpadding="0" cellspacing="0" width="500">
		<tr>
			<td>番号</td>
			<td>タイトル</td>
			<td>作成者</td>
			<td>日付</td>
			<td>ヒット数</td>
		</tr>

<!-- MEMO 
items: 繰り返し処理の対象となる集合（配列、Mapなど）を指定
　　　　cf) model.addAttribute("list", bVOs);
var  : 繰り返し処理した値が格納する、変数名 -->
		  
		<c:forEach items="${list}" var="vo">
			<tr>
				<td>${vo.bNo}</td>
				<td>
					<c:forEach begin="1" end="${vo.bIndent}">ㄴ</c:forEach>
					<a href="contentView?bNo=${vo.bNo}">${vo.bSubject}</a>
				</td>
				<td>${vo.bName}</td>
				<td>${vo.bDate}</td>
				<td>${vo.bHit}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5" align="center"><a href="writeForm">書き込み</a></td>
		</tr>
	</table>	

</div>
</body>
</html>