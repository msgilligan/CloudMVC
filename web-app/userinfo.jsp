<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
<title>User Info</title>
</head>
<body>
<h1>User Info</h1>
<% if (request.getAttribute("user") != null) { %>
<p>Current user is <c:out value="${user.nickname}"/></p>
<% } else { %>
<p>No user logged in.</p>
<% } %>
<p>This page is a JSP.</p>
</body>
</html>
