<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页</title>
</head>
<body>
	<form action="<c:url value='/login'/>" method="post">
		手机号：<input type="text" name="phoneNum"/><br/>
		密码：<input type="password" name="password"/><br/>
		<input type="submit" value="提交"/>&nbsp;&nbsp;
		<input type="reset" value="重置"/>
	</form>


</body>
</html>