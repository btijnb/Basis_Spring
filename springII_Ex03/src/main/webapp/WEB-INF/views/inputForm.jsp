<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div align="center">
	<hr width="400" color="red"/>
	<h2>個人情報入力</h2>
	<hr width="400" color="red"/>
	
	<form action="person" method="post"> <!-- MEMO = コントローラーの@RequestMapping(value="/person" -->
		名前：<input type="text" name="name"/><br/>
		ID：<input type="text" name="id"/><br/>
		<input type="submit" value="転送" />
	</form>
</div>
	
</body>
</html>