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
	list ������
	<table>
		<thead>
			<tr>	
				<td>�۹�ȣ</td>
				<td>�ۼ���</td>
				<td>��  ��</td>
				<td>��   ��</td>
				<td>�ۼ��Ͻ�</td>
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