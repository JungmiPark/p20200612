<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>물품일괄등록</title>
	<link
		href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
		rel="stylesheet" />
</head>
<body>
	<div class="container">
		<form action="${pageContext.request.contextPath}/admin/iteminsert" method="post">
		<table class="table table-sm">
			<c:forEach var="i" begin="1" end="5" step="1">
			<tr>				
				<td><input type="text" name = "name[]" placeholder="물품명" value="수박"/></td>
				<td><input type="text" name = "price[]" placeholder="물품가격" value="5000"/></td>
				<td><input type="text" name = "qty[]" placeholder="재고수량" value="300" /></td>
				<td><input type="text" name = "content[]" placeholder="물품설명" value="시원달콤" /></td>				
			</tr>
			</c:forEach>
		</table>
		<input type="submit" class="btn btn-success" value="일괄추가" />
		</form>
	</div>

</body>
</html>