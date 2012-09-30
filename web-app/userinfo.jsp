<%@ page contentType="text/html" %>
<html>
  <head>
    <title>User Info</title>
  </head>
<body>
  <h1>User Info</h1>
  <% if (request.getAttribute("user") != null) { %>
  <p>Current user is ${user.nickname}</p>
  <% } else { %>
  <p>No user logged in.</p>
  <% } %>
  <p>This page is a JSP.</p>
</body>
</html>
