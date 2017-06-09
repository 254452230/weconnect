<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="../common/common.jsp" %>
	<title>Blog</title>
</head>
<body>
		<%@ include file="../common/header.jsp" %>
		<div class="container">
			<br/><br/>
			<div class="jumbotron">
			  	<h3>技术支持</h3>
			  	<p>如有疑问，请联系客服。</p>
			</div>
			<div class="table-responsive">
            	<table class="table table-striped">
            		<thead>
                		<tr>
                  			<th>#</th>
                  			<th>博文</th>
                  		</tr>
                  	</thead>
                  	<tbody>
                  		<c:forEach var='blogVO' items='${blogVOList}'>
                  			<tr>
                  				<td><c:out value = "${blogVO.seq}"/></td>
                  				<td><a href="<c:out value = '${blogVO.link}'/>"><c:out value = "${blogVO.title}"/></a></td>
                  			</tr>
                  		</c:forEach>
                  	</tbody>
            	</table>
            </div>
		</div>
</body>
</html>