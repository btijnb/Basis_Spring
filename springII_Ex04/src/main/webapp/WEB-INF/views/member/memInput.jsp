<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>

<div align="center">
<h2>会員登録ページ</h2>
<hr>

<spring:hasBindErrors name="member" />
<form action="inputOK"> <!-- MEMO /inputOKにすると、URLでコンテキスト名の「validationEx」が抜かれてしまう -->
<table border="1" width="">

<tr>
	<td>名前</td><td><input type="text" name="name" value="" />
	<form:errors path="member.name"/>

<!-- <form:errors path="Member.name"/></td> <!-- MEMO unknown tag エラーメッセージ出てきたら、最上部にライブラリー追加-->
</tr>
<tr><td>ID</td><td><input type="text" name="id" value="" /></td></tr>
<tr><td>マイナンバー</td><td><input type="text" name="memNo" value="" /></td></tr>

</table>
<input type="submit" value="転送"/>
</form>

</div>

</body>

</html>