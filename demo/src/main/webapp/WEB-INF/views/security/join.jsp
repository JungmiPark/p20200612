<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/security/join" method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		아이디 : <input type ="text" name="username" /> <br />
		비밀번호 : <input type ="password" name="password" /> <br />
		등급 : <select name ="role">
			<option value="USER">회원</option>
			<option value="MANAGER">매니저</option>
			<option value="ADMIN">관리자</option>			
		</select>		
		<input type ="submit" value="회원가입" />
	</form>
</body>
</html>