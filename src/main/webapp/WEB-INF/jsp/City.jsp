<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<td>用户id</td>
<td>用户名</td>
<td>是否删除</td>
</tr>
<c:forEach items="${dl}" var="city">

<tr>
<td>${city.id}</td>
<td>${city.name}</td>
<td>${city.del}</td>
<td><a href="delete?id=${city.id}">删除</a></td>
<td><a href="xg?id=${city.id }">修改</a></td>
<td><input name="checkbox" type="checkbox" value="checkbox"  />
批量删除
</td>
</tr>
</c:forEach>

</table>
</body>
</html>