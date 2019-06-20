<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="per.sun.modal.Platform" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/main.css">
<title>检索</title>
</head>
<body>
<div id="heard">
<h1>河北科技创新平台年报系统</h1>
</div>
<div id="body">
	<div class="leader">
		<ul>
			<li><a href="../ManageServe?ty=1&choose=重点实验室">重点实验室</a></li>
			<li><a href="../ManageServe?ty=1&choose=工程技术研究中心">工程技术研究中心</a></li>
			<li><a href="../ManageServe?ty=1&choose=产业技术研究院">产业技术研究院</a></li>
			<li><a href="../ManageServe?ty=2&choose=国家级">国家级</a></li>
			<li><a href="../ManageServe?ty=2&choose=省级">省级</a></li>
			<li class="right"><a href="../ManageServe?ty=3&choose=all">查看全部</a></li>
		</ul>
	</div>
	<div class="search">
	<p>搜索条件</p>
	<hr>
	
	<form action="..//ManageServe" method="post"> 
	<table align="center">
		<tr><td>输入准确信息</td></tr>
		<tr><td class="condition">平台名称</td></tr>
		<tr><td class="input"><input type="text" name="pname" ></td></tr>
		<tr><td class="condition">平台主任（院长）</td></tr>
		<tr><td class="input"><input type="text" name="pyname"></td></tr>
		<tr><td><input type="submit" value="查询" class="sub"></td></tr>
	</table>
	</form>
	<form action="..//ManageServe" method="post">
		<table align="center">
			<tr><td>模糊查询</td></tr>
			<tr><td class="condition">平台名称</td></tr>
			<tr><td class="input"><input type="text" name="pnameMo" ></td></tr>
			<tr><td><input type="submit" value="查询" class="sub"></td></tr>
		</table>
	</form>
	</div>
	<div class="content">
	<p>搜索结果</p>
	<hr>
	<table align="center">
	<tr><td>平台名称</td><td>平台网站</td><td>详细信息</td></tr>
	<%
		
		List<Platform> plats=new ArrayList<Platform>();
		plats=(List<Platform>)session.getAttribute("list");
		if(plats!=null){
		for(Platform plat:plats){
	%>
		<tr><td><%=plat.getPname()%></td><td><%=plat.getPwangzhanming()%></td><td><a href="information.jsp?pname=<%=plat.getPname()%>">查询</a></td></tr>
<%} }%>
	</table>
	</div>
</div>
<div id="tail">
<hr>
<p>石家庄铁道大学软件工程王牌飞行员 - 库奇出版<br>版权号1008611</p>
</div>
</body>
</html>