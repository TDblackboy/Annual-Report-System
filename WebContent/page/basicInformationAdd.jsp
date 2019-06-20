<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>BASIC INFORMATION</title>
<link rel="stylesheet" type="text/css" href="../css/background.css">
<script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="../js/linkage.js"></script>
<script type="text/javascript" src="../js/linkage2.js"></script>
<script type="text/javascript" src="../js/linkage3.js"></script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
<div id="body">
	<form action="..//BasicInformation" method="post">
		<table align="center">
		<tr><td><input type="hidden" name="type" value="1"></td></tr>
			<tr>
				<td colspan="2"><h2>平台</h2></td>
			</tr>
			<!-- input只读 readonly（可复制），disabled -->
			<tr>
				<td>平台名称</td>
				<td colspan="2"><input type="text" class="readonly" value="平台"
					readonly /></td>
			</tr>
			<tr>
				<td>平台编号</td>
				<td colspan="2"><input type="text" class="readonly" value="编号"
					readonly /></td>
			</tr>
			<!--只输入数值+onkeyup/onkeypress事件（键盘输入）  -->
			<tr>
				<td>批准年月</td>
				<td colspan="2"><input type="text" class="readonly" readonly
					value="date"></td>
			</tr>
			<tr>
				<td>批准文号</td>
				<td colspan="2"><input type="text" class="readonly" readonly
					value="wenhao"></td>
			</tr>
			<tr>
				<td>技术领域</td>
				<td colspan="2"><input type="text" class="readonly" readonly
					value="jishu"></td>
			</tr>
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td>平台级别</td>
				<td><input type="checkbox" name="pjibie" value="国家级">国家级</td>
				<td><input type="checkbox" name="pjibie" value="省级">省级</td>
			</tr>
			<tr>
				<td>所在县市（区）</td>
				<td colspan="2">
				<select id="sel_p" name="sheng"></select>
				<select id="sel_c" name="shi"></select>
				<select id="sel_a" name="xian"></select></td>
			</tr>
			<tr>
				<td>平台组织形式</td>
				<td colspan="2"><input type="text" value="------" readonly></td>
			</tr>
			<tr>
			<!-- lingkage2 -->
				<td>服务的主要国名经济行业</td>
				<td colspan="2">
				<select id="h_p" name="hp"></select>
				<select id="h_c" name="hc"></select>
				<select id="h_a" name="ha"></select></td>
			</tr>
			<tr>
			<!-- lingkage3 -->
				<td>所属的主要学课</td>
				<td colspan="2">
				<select id="x_p" name="xp"></select>
				<select id="x_c" name="xc"></select>
				<select id="x_a" name="xa"></select></td>
			</tr>
			<tr>
				<td>共建单位</td>
				<td colspan="2"><input type="text" value="------" readonly></td>
			</tr>

			<tr>
				<td><input type="submit" value="确定>>下一步" class="sub"></td>
			</tr>
			<tr>
				<td><div id="next"><a href="login.jsp">>>退出</a></div></td>
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