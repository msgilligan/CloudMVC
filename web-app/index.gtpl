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
    	<h2>About Cloud MVC</h2>
    	<p>Cloud MVC is an experimental project that aims to make it easy to use the Groovy programming
    	languge for server-side web MVC on "cloud" platforms like Google App Engine.  It is based on
    	the Spring MVC framework.</p>
    	<p>The <a href="http://github.com/msgilligan/CloudMVC">CloudMVC project</a> is on GitHub and will be licensed under ASL2</p>
		<h2>Example Controllers</h2>
		<ol>
			<li>
				<a href="counter">Counter</a> (Java/Spring Controller/Direct output)
				<a href="http://github.com/msgilligan/CloudMVC/blob/master/src/main/java/com/msgilligan/cloudmvc/controller/CounterController.java">view source</a>
			</li>
			<li>
				<a href="helloWorld">Hello World</a> (Java/Spring Controller/JSP View)
				<a href="http://github.com/msgilligan/CloudMVC/blob/master/src/main/java/com/msgilligan/cloudmvc/controller/HelloWorldController.java">view source</a>
			</li>
			<li>
				<a href="helloWorldGroovy">Hello World Groovy</a> (Groovy/Spring Controller/JSP View)
				<a href="http://github.com/msgilligan/CloudMVC/blob/master/src/main/groovy/com/msgilligan/cloudmvc/controller/GroovyHelloWorldController.groovy">view source</a>
			</li>
			<li>
				<a href="gaelykController">User Info Gaelyk</a> (Groovy/Spring Controller with Gaelyk/JSP View)
				<a href="http://github.com/msgilligan/CloudMVC/blob/master/src/main/groovy/com/msgilligan/cloudmvc/controller/GaelykDemoController.groovy">view source</a>
			</li>
		</ol>
		
		<p>This page is currently a normal Gaelyk .gtpl page and is not loaded via Spring MVC</p>
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
