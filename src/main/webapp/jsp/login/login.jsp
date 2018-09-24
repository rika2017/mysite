<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>登录</title>
	</head>
	<body>
		<br>
			<form name="loginForm" method="post" action="LoginServlet.action">
			<table>
				<tr>
					<td><div align="right">用户名:</div></td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td><div align="right">密码:</div></td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
				<td></td>
				<td><input type="Submit" name="Submit" value="确定"></td>
				</tr>
			</table>
			</form>
	</body>
</html>