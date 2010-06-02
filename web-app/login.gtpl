<%
	Boolean admin = false;
	if (user && users.isUserAdmin() ) {
		admin = true;
	}
%>
<!DOCTYPE html>
<html>
<head>
<title>Cloud MVC Project Login Page</title>
</head>

<body>
    <div class="login">
		<%  if (user) {  %>
		  <a class="button" href="<%= users.createLogoutURL(request.requestURI) %>">Logout</a>
		<%  } else {  %>
		  <a class="button" href="<%= users.createLoginURL(request.requestURI) %>">Login</a>
		<%  }  %>
    </div>

	<p>This page is a standalone Gaelyk .gtpl page and is not loaded via Spring MVC</p>
	
	<a href="/">Go Home</a>
       
   <div id="info">
		<%  if (user) {  %>
		  <p>User: <%= user.nickname %></p>
		<%  } else {  %>
		  <p>Not logged in.</p>
		<%  }  %>
	   </p>
	   	<% if (admin) { %>
			<p>User is an admin</p>
		<%  }  %>		

 		<% if (localMode) { %>
		<a target="_blank" href="http://localhost:8080/_ah/admin">Local Admin</a>
		<%  }  %>
   </div>
    

</body>
</html>
