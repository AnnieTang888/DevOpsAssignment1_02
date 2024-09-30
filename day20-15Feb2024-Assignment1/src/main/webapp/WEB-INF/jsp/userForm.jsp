<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
</head>
<body>
<div align = "center">
<h1>User Form</h1>
<f:form action="saveUser"  method="POST"  modelAttribute="user">
<table border = "1">

<tr>
<td>userId</td><td><f:input type="text" path="userId" value="${user.getUserId()}"/></td>
</tr>

<tr>
<td>userName</td><td><f:input type="text" path="username" value="${user.getUsername()}" /></td>
</tr>

<tr>
<td>password</td><td><f:input type="text" path="password" value="${user.getPassword()}"/></td>
</tr>

<tr>
<td>email</td><td><f:input type="text" path="email" value="${user.getEmail()}"/></td>
</tr>

<tr>
<td colspan ="2" align="center"><td><input type="submit" value="Submit"/></td>
</tr>

</table>
</f:form>

<p/>
<p/>
<p/>
<c:if test="${not empty users}">
<h1>***List of Users***${users.size()}</h1>
<table border="1">
<tr><td>User Id</td><td>User Name</td><td>Password</td><td>Email</td><td>Action</td></tr>
<c:forEach items = "${users}" var="e">
<tr>
<td>${e.getUserId() }</td>
<td>${e.getUsername() }</td>
<td>${e.getPassword() }</td>
<td>${e.getEmail() }</td>
<td>
<a href="updateUser?userId=${e.getUserId()}">Update</a>
<a href="deleteUser?userId=${e.getUserId()}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
</c:if>
</div>
</body>
</html>