CloudMVC - Groovy, Gaelyk & Spring MVC on Google App Engine
=============================================================

This is a dead project
----------------------

This project/repository was created to experiment with ideas for a lightweight Java/Groovy webapps using a subset of Spring and Spring MVC in a Cloud environment. At the time GAE was the best available low-cost option for hosting Java applications in the cloud, now there are many more options and most of them better support Java standards better than GAE.

Live frameworks that implement these ideas
------------------------------------------

If you're looking for something real that you can actually develop with, I'd recommend looking at the following projects.  

* [Spring Boot](http://projects.spring.io/spring-boot/) -- If Spring compatibility is important to you.
* [Ratpack Framework](http://www.ratpack.io) -- If you want something lightweight and fast (Netty-based)

Project Archive
---------------

This project will remain online for historical reasons only.

* Source: [http://github.com/msgilligan/CloudMVC/](http://github.com/msgilligan/CloudMVC/)
* Demo: [http://cloudmvc.appspot.com/](http://cloudmvc.appspot.com/)
* Download: No downloads were ever made available.
* Mailing List: None (but there has been some discussion on the Gaelyk list)
 * [Project Announcement](https://groups.google.com/d/msg/gaelyk/inBKYmsxK90/e6_YAfINOskJ)
 * [Addressing the GAE "Loading Request" problem](https://groups.google.com/d/msg/gaelyk/tGMB81B5Iog/AicmbyOvoa4J)


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

* Run development server to allow direct editing of Groovy scripts from gradle *Run
* Turn off logging for performance measurement
* Use categories or other method to add Gaelyk functions to Groovy controllers
* Use Spring bean reloading to dynamically reload controllers in development mode
* Groovy Templates (.gtpl) as Spring MVC views
* Precompile .gtpl files before deployment
* Can controllers be lazy loaded?
* Library available as a jar?
* Maven archetype?
* Gaelyk plugin?
* Grails plugin?
* Anything to speed up loading requests (aka JVM startup)

Take it for a test drive
------------------------

* Make sure you have Gradle installed
* Clone this project with Git
* To run test server on port 8080:  "gradle gaeRun"
* To deploy to GAE: "gradle gaeUpload" (change app id in appengine-web.xml first)


Projects Used
--------------

* [Spring MVC](http://static.springsource.org/spring/docs/current/spring-framework-reference/html/mvc.html)
* [Groovy](http://groovy.codehaus.org/)
* [Gradle](http://www.gradle.org)
* [Gradle Tomcat Plugin](https://github.com/bmuschko/gradle-tomcat-plugin)
* [Gaelyk](http://gaelyk.appspot.com/)
* [Google App Engine Java](http://code.google.com/appengine/docs/java/overview.html)

License
-------
Apache Software License 2.0 goes here
