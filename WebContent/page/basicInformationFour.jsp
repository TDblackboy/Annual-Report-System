<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BASIC INFORMATION</title>
<link rel="stylesheet" type="text/css" href="../css/background.css">
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
<div id="body">
	<form action="..//BasicInformation" method="post">
		<table align="center">
			<tr><td><input type="hidden" name="type" value="4"></td></tr>
			<tr>
				<td colspan="2"><h2>平台联系信息</h2></td>
			</tr>
			<tr>
				<td>平台网站名称</td>
				<td><input type="text" name="pwangzhanming"></td>
			</tr>
			<tr>
				<td>网址</td>
				<td><input type="text" name="pwangzhi"></td>
			</tr>
			<tr>
				<td>平台通讯地址</td>
				<td><input type="text" name="ptongxundizhi"
					placeholder="平台办公所在地地址"></td>
			</tr>
			<tr>
				<td>邮编</td>
				<td><input type="text" name="pyoubian"></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交" class="sub"></td>
			</tr>
			<tr>
				<td><div id="next"><a href="basicInformationThrid.jsp">上一步</a></div></td>
			</tr>
		</table>
	</form>
	</div>	
	<hr>
	<p>
		石家庄铁道大学软件工程王牌飞行员 - 库奇出版<br>版权号1008611
	</p>
</body>
</html>