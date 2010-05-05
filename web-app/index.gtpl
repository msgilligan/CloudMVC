<%
	Boolean admin = false;
	if (user && users.isUserAdmin() ) {
		admin = true;
	}
%>
<!DOCTYPE html>
<html>
<head>
<title>Cloud MVC Project</title>
</head>

<body>
    <div class="login">
		<%  if (user) {  %>
		  <a class="button" href="<%= users.createLogoutURL(request.requestURI) %>">Logout</a>
		<%  } else {  %>
		  <a class="button" href="<%= users.createLoginURL(request.requestURI) %>">Login</a>
		<%  }  %>
    </div>
    
    <div id="main">
		<h2>Example Controllers</h2>
		<ol>
			<li><a href="helloWorld">Hello World</a> (Java)</li>
			<li><a href="counter">Counter</a> (Java)</li>
		</ol>
		
		<p>This page is currently normal Gaelyk .gtpl page and is not loaded via Spring MVC</p>
   </div>
   
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
