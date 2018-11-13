<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
<h1>登录</h1>
<div id="loginFormWrapper">
	<form action="login" method="post">
		<div>
			<label>用户名</label><input type="text" name="username" maxlength="32" placeholder="用户名" />
		</div>
		<div>
			<label>密码</label><input type="password" name="password" maxlength="32" placeholder="密码" />
		</div>
		<div>
			<button>提交</button>
		</div>
	</form>
</div>
</body>
</html>