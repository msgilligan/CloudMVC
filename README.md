CloudMVC - Groovy, Gaelyk and Spring MVC on Google App Engine
=============================================================

* Source: [http://github.com/msgilligan/CloudMVC/](http://github.com/msgilligan/CloudMVC/)
* Download: Not yet (maybe never)
* Demo: [http://cloudmvc.appspot.com/](http://cloudmvc.appspot.com/)
* Mailing List: None (but there has been some discussion on the Gaelyk list)

Goals
-----

This is an experimental project.  It does have a few goals, though:

* Fast startup for rapid JVM launch (loading requests on Google App Engine)
* Allow scripting controllers and views using Groovy with no compile for local test
* All Groovy code in controllers and views is pre-compiled before deployment
* Allow components to be reused in other Spring MVC and Grails projects
* Use Gaelyk [http://gaelyk.appspot.com/](http://gaelyk.appspot.com/) on GAE
* Promote portability to alternate "cloud-oriented" and standard Servlet containers
* Use Spring MVC to provide a lightweight but flexible MVC layer
* Focus only on controllers and views


Completed
---------

* Groovy, GAE, and Gaelyk are downloaded/installed/deployed using Maven
* Spring MVC and Gaelyk run side-by-side
* Spring MVC controller written in Groovy
* Spring MVC controller written in Groovy with Gaelyk enhancements

To Do
------

* Anything to speed up loading requests (aka JVM startup)
* Run development server to allow direct editing of Groovy scripts "mvn gae:run"
* Use categories or other method to add Gaelyk functions to Groovy controllers
* Use Spring bean reloading to dynamically reload controllers in development mode
* Groovy Templates (.gtpl) as Spring MVC views
* Precompile .gtpl files before deployment
* Can controllers be lazy loaded?
* Library available as a jar?
* Maven archetype?
* Gaelyk plugin?
* Grails plugin?

Take it for a test drive
------------------------

* Make sure you have Maven 2 installed (built-in to Mac OS X dev tools)
* Clone this project with Git
* To run test server on port 8080:  "mvn gae:run"
* To deploy to GAE: "mavn gae:deploy" (change app id in appengine-web.xml first)


Projects Used
--------------

* [http://static.springsource.org/spring/docs/3.0.x/spring-framework-reference/html/mvc.html] (Spring MVC)
* [http://groovy.codehaus.org/] (Groovy)
* [http://gaelyk.appspot.com/] (Gaelyk)
* [http://code.google.com/appengine/docs/java/overview.html] (Google App Engine Java)
* [http://maven.apache.org/] (Maven)
* [http://code.google.com/p/maven-gae-plugin/] (GAE Maven Plugin)
* [http://code.google.com/p/maven-gaelyk/] (Gaelyk Maven Archetype)

License
-------
Apache Software License 2.0 goes here
