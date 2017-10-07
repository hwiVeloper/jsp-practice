<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	list 페이지
	<table>
		<thead>
			<tr>	
				<td>글번호</td>
				<td>작성자</td>
				<td>제  목</td>
				<td>내   용</td>
				<td>작성일시</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="item">
				<tr>
					<td>${item.bId}</td>
					<td>${item.bName}</td>
					<td>
						<a href="contentView.do?id=${item.bId}">
							${item.bTitle}
						</a>
					</td>
					<td>${item.bContent}</td>
					<td>${item.bDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>