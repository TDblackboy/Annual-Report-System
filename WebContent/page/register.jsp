<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>REGISTER</title>
<link rel="stylesheet" type="text/css" href="../css/register.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/register.js"></script>
</head>
<body>
	<h1>河北科技创新平台注册</h1>
	<hr>
<div id="re">
	<form action="..//RegisterServlet" method="post">
		<div><div class="d1">
			<table>
			<tr><th colspan="2" align="left"><h2>平台信息：</h2></th></tr>
			<tr><td rowspan="3">平台类别</td>
				<td align="left"><input type="radio" name="pleibie" value="重点实验室">重点实验室</td></tr>
				<tr><td align="left"><input type="radio" name="pleibie" value="工程技术研究中心">工程技术研究中心</td></tr>
				<tr><td align="left"><input type="radio" name="pleibie" value="产业技术研究院">产业技术研究院</td></tr>
			<tr><td>平台名称</td><td><input type="text" name="pname"></td></tr>
			<tr><td>依托单位（盖章）</td><td><input type="text" name="pyituodanwei"></td></tr>
			<tr><td>归口管理部门</td><td><input type="text" name="pguikoubumen"></td></tr>
			</table>
			</div>
		<div class="d2">
			<table>
			<tr><th colspan="2" align="left"><h2>填表人信息：</h2></th></tr>
			<tr><td>填表人</td><td><input type="text" name="tname"></td></tr>
			<tr><td>所在部门</td><td><input type="text" name="tbumen"></td></tr>
			<tr><td>联系电话</td><td><input type="text" name="tdianhua" onkeyup="value=value.replace(/[^\d]/g,'')"></td></tr>
			<tr><td>手机号</td><td><input type="text" name="tshoujihao" onkeyup="value=value.replace(/[^\d]/g,'')"></td></tr>
			<tr><td>e-mail地址</td><td><input type="text" name="temail" onblur="checkemail(this)"></td></tr>
			<tr>
				<td>填报时间</td><td><input  type="date" name="time" value=""><td></td>
			 
			<!-- 限制输入数字	<td><input name="tyear" class="date" type="text"
					onkeyup="value=value.replace(/[^\d]/g,'')" maxlength="4"
					value="year">年</td>
				<td><input name="tmonth" class="date"
					onkeyup="value=value.replace(/[^\d]/g,'')" maxlength="2"
					value="month">月</td>
				<td><input name="tday" class="date"
					onkeyup="value=value.replace(/[^\d]/g,'')" maxlength="2"
					value="day">日</td> -->
			
			</table>
			</div></div>
		<div class="d3">
			<table>
			<tr><th colspan="2" align="left"><h2>登陆信息：</h2></th></tr>
			<tr><td>账户</td><td><input type="text" name="username"></td></tr>
			<tr><td>密码</td><td><input type="password" name="userpass"></td></tr><!--11位  -->
			<tr><td>确认密码</td><td><input type="password" name="userpass2"></td></tr>
			<tr><td>验证码</td><td><img src="../images/jianming.png"></td></tr>
			<tr>
				<td><input type="submit" value="提交" class="sub"></td>
				<td><div id="next"><a href="./login.jsp">>>返回登陆</a></div></td>
			</tr>
			</table>
			</div>
	
	</form>
</div>
	<div>
	<hr>
	<p>石家庄铁道大学软件工程王牌飞行员 - 库奇出版<br>版权号1008611</p>
	</div>
</body>
</html>