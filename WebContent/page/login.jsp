<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOGIN</title>
<link rel="stylesheet" type="text/css" href="../css/login.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/login.js"></script>
</head>
<body>
	<div id="main">
		<h3>欢迎使用</h3>
		<h2>河北省科技创新平台年报系统</h2>
		<form action="..//LoginServlet" method="post" onsubmit="return login();">
			<table align="center" cellspacing="15px">
				<tr>
					<td>账号</td>
					<td><input type="text" id="name" name="username"  onfocus="onfocuss(this)" onblur="onblurr(this)" maxlength="8"></td>
					<td><span id="errname"></span></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input type="password" id="pass" name="userpass"  onfocus="onfocuss(this)" onblur="onblurr(this)" maxlength="9"></td>
					<td><span id="errpass"></span></td>
				</tr>
				<tr>
					<td><input type="submit" value="登陆" class="sub"></td>
					<td><a href="register.jsp">注册新账户</a></td>
					<td></td>
				</tr>
			</table>
		</form>
		
	</div>
</body>
</html>