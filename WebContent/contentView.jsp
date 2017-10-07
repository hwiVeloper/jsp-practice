<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form action="modify.do" method="post">
			<input type="hidden" name="bid" value="${detail.bId}">
			
			<div class="row justify-content-md-center">
			    <div class="col-md-6 mb-3">
			      <label for="validationServer01">번호</label>
			      <input type="text" class="form-control is-valid" id="validationServer01" name="bId" value="${detail.bId}" readonly required>
			    </div>
	   		</div>
	   		
	   		<div class="row justify-content-md-center">
			    <div class="col-md-6 mb-3">
			      <label for="validationServer02">제목</label>
			      <input type="text" class="form-control is-valid" id="validationServer02" name="bTitle" value="${detail.bTitle}" required>
			    </div>
	   		</div>

			<div class="row justify-content-md-center">
			    <div class="col-md-6 mb-3">
			      <label for="validationServer03">이름</label>
			      <input type="text" class="form-control is-valid" id="validationServer03" name="bName" value="${detail.bName}" required>
			    </div>
	   		</div>
	   		
	   		<div class="row justify-content-md-center">
			    <div class="col-md-6 mb-3">
			      <label for="validationServer04">내용</label>
			      <input type="text" class="form-control is-valid" id="validationServer04" name="bContent" value="${detail.bContent}" required>
			    </div>
	   		</div>
	   		<div class="row justify-content-center">
				<button class="btn btn-outline-success" type="submit">수정</button>
				<a href="delete.do?id=${detail.bId}">
					<button class="btn btn-outline-info" type="button">삭제</button>
				</a>
			</div>
		</form>
	</div>
</body>
</html>