<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="per.sun.dao.*" %>
<%@ page import="per.sun.modal.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/main.css">
<title>INFORMATION</title>
</head>
<body>
<div id="heard">
<h1>河北科技创新平台年报系统</h1>
</div>
<div id="body">
	<a href="query.jsp">>>返回查询</a><br>
	<p>平台资料<p>
	<%
		String pname=request.getParameter("pname");
		Platform plat=new Platform();
		PlatformQuery pq=new PlatformQueryImp();
		plat=pq.load(pname);
	%>
	<table align="center">
		<tr><td>平台名称</td><td><%=plat.getPname() %></td></tr>
		<tr><td>平台类型</td><td><%=plat.getPtype() %></td></tr>
		<tr><td>平台级别</td><td><%=plat.getPjibie() %></td></tr>
		<tr><td>技术领域</td><td><%=plat.getPxueke() %></td></tr>
		<tr><td>依托单位</td><td><%=plat.getPyituodanwei() %></td></tr>
		<tr><td>行政区</td><td><%=plat.getPxianshi() %></td></tr>
		<tr><td>服务行业</td><td><%=plat.getPhangye() %></td></tr>
		<tr><td>主要学课</td><td><%=plat.getPxueke() %></td></tr>
		<tr><td>平台主任</td><td><%=plat.getPyname() %></td></tr>
		<tr><td>平台网址</td><td><%=plat.getPwangzhi() %></td></tr>
		<tr><td>办公所在</td><td><%=plat.getPyoubian() %></td></tr>
		<tr><td>填表时间</td><td><%=plat.getTime() %></td></tr>
	</table>
</div>
<div id="tail">
<hr>
<p>石家庄铁道大学软件工程王牌飞行员 - 库奇出版<br>版权号1008611</p>
</div>
</body>
</html>