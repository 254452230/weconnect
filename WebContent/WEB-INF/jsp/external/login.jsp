<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="../common/common.jsp" %>
	<!-- Custom styles for this template -->
    <link href="${cp}/resources/css/signin.css" rel="stylesheet">
	<title>用户登录</title>
</head>
<body>
	<div class="container">
	  	<form class="form-signin" action="${cp}/processLogin" method="post">
	  		<input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
		    <h2 class="form-signin-heading">WeConnect</h2>
		    <label for="userName" class="sr-only">用户名</label>
		    <input type="text" name="userName" class="form-control" placeholder="用户名" required autofocus/>
		    <label for="password" class="sr-only">密码</label>
		    <input type="password" name="password" class="form-control" placeholder="密码" required/>
		    <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
	  	</form>
	</div>
</body>
</html>