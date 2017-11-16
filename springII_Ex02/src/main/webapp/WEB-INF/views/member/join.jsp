<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>personオブジェクト＆modelオブジェクトもらう場合</h3>
	名前：${personInfo.name}<br>
	ID：${personInfo.id}<br>
	住所：${personInfo.address}<br>
	メール：${personInfo.email}

<h3>personオブジェクトだけもらう場合</h3>
	名前：${person.name}<br>
	ID：${person.id}<br>
	住所：${person.address}<br>
	メール：${person.email}
</body>
</html>