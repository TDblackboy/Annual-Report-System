<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BASIC INFORMATION</title>
<link rel="stylesheet" type="text/css" href="../css/registerOne.css">
<link rel="stylesheet" type="text/css" href="../css/background.css">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
<div id="body">
	<form action="..//BasicInformation" method="post">
		<table align="center">
			<tr><td><input type="hidden" name="type" value="2"></td></tr>
			<tr>
				<td colspan="2"><h2>依托单位</h2></td>
			</tr>
			<tr>
				<td>单位名称</td>
				<td colspan="2"><input type="text" name="yname"></td>
			</tr>
			<tr>
				<td>单位法人代表姓名</td>
				<td colspan="2"><input type="text" name="yren"></td>
			</tr>
			<tr>
				<td>单位组织机构代码</td>
				<td colspan="2"><input type="text" name="yjigou"
					placeholder="社会信用代码"></td>
			</tr>
			<tr>
				<td>办公电话</td>
				<td colspan="2"><input type="text" name="ydianhua"
					onkeyup="value=value.replace(/[^\d]/g,'')"></td>
			</tr>
			<tr>
				<td rowspan="4">单位类型</td>
				<td><input type="radio" name="ytype" value="政府机构">政府机构</td>
				<td><input type="radio" name="ytype" value="科研机构">科研机构</td>
			</tr>
			<tr>
				<td><input type="radio" name="ytype" value="高等院校">高等院校</td>
				<td><input type="radio" name="ytype" value="检测机构">检测机构</td>
			</tr>
			<tr>
				<td ><input type="radio" name="ytype" value="医疗机构">医疗机构</td>
				<td ><input type="radio" name="ytype" value="社团组织">社团组织</td>
			</tr>
			<tr>
				<td align="left"><input type="radio" name="ytype" value="企业">企业</td>
				<td align="left"><input type="radio" name="ytype" value="其他">其他</td>
			</tr>
			<tr>
				<td><input type="submit" value="确定>>下一步" class="sub"></td>
			</tr>
			<tr>
				<td><div id="next"><a href="basicInformationAdd.jsp">>>上一步</a></div></td>
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