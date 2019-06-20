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
			<tr><td><input type="hidden" name="type" value="3"></td></tr>
			<tr>
				<td ><h2>平台主任（院长）信息</h2></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td colspan="2"><input type="text" name="pyname"></td>
			</tr>
			<tr>
				<td>性别</td>
				<td ><input type="radio" name="pysex" value="男">男</td>
				<td><input type="radio" name="pysex" value="女">女</td>
			</tr>
			<tr>
				<td >出生年月</td>
				<td colspan="2"><input type="date" name="pybrith"></td>
				<!-- <td><input class="date" type="text"
					onkeyup="value=value.replace(/[^\d]/g,'')" maxlength="4"
					value="year" width="30px">年</td>
				<td><input class="date"
					onkeyup="value=value.replace(/[^\d]/g,'')" maxlength="2"
					value="month">月</td>
				<td><input class="date"
					onkeyup="value=value.replace(/[^\d]/g,'')" maxlength="2"
					value="day">日</td> -->
			</tr>
			<tr>
				<td>职称</td>
				<td colspan="2"><input type="text" name="pyzhicheng"></td>
			</tr>
			<tr>
				<td>所学专业</td>
				<td colspan="2"><input type="text" name="pyzhuanye"></td>
			</tr>
			<tr>
				<td>学历</td>
				<td colspan="2"><input type="text" name="pyxueli"></td>
			</tr>
			<tr>
				<td>学位</td>
				<td colspan="2"><input type="text" name="pyxuewei"></td>
			</tr>
			<tr>
				<td>办公电话</td>
				<td colspan="2"><input type="text" name="pydianhua"
					onkeyup="value=value.replace(/[^\d]/g,'')"></td>
			</tr>
			<tr>
				<td>手机</td>
				<td colspan="2"><input type="text" name="pyshouji"
					onkeyup="value=value.replace(/[^\d]/g,'')"></td>
			</tr>
			<tr>
				<td>E-mail</td>
				<td colspan="2"><input type="text" name="pyemail"></td>
			</tr>
			<tr>
				<td><input type="submit" value="确定>>下一步" class="sub"></td>
			</tr>
			<tr>
				<td><div id="next"><a href="basicInformationTwo.jsp">>>上一步</a></div></td>
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