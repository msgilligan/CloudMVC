package com.msgilligan.cloudmvc.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

import javax.annotation.PostConstruct

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import groovyx.gaelyk.GaelykCategory
import groovyx.gaelyk.QueueAccessor
import groovyx.gaelyk.plugins.PluginsHandler

import com.google.appengine.api.datastore.DatastoreServiceFactory
import com.google.appengine.api.images.ImagesServiceFactory
import com.google.appengine.api.mail.MailServiceFactory
import com.google.appengine.api.memcache.MemcacheServiceFactory
import com.google.appengine.api.urlfetch.URLFetchServiceFactory
import com.google.appengine.api.users.UserService
import com.google.appengine.api.users.UserServiceFactory
import com.google.appengine.api.labs.taskqueue.QueueFactory
import com.google.appengine.api.xmpp.XMPPServiceFactory
import com.google.apphosting.api.ApiProxy
import com.google.appengine.api.blobstore.BlobstoreServiceFactory

//
// Brute-force attempt to get Gaelyk functionality in a SpringMVC controller
// If this works we should create a better way of getting the same functionality
// without quite so much code in the controller
//
@Controller
public class GaelykDemoController {
	protected final Log logger = LogFactory.getLog(getClass())

	// This should be moved to a bean that is initialized with the container
	// but for now let's keep all the code in one controller
	@PostConstruct
	public void initGaelykPlugins() {
		PluginsHandler.instance.initPlugins()
	}

	@RequestMapping("/gaelykController")
	public ModelAndView helloWorld() {
		use([GaelykCategory, * PluginsHandler.instance.categories]) {
			logger.info("Return View")
			def mav = new ModelAndView("userinfo.jsp")
			addGaelykBindings(mav)
			return mav
		}
	}
	
	private addGaelykBindings(ModelAndView mav)
	{
		logger.info("Adding Gaelyk info")
		// ** Copied code from GaelykBindingEnchancer **
		// bind google app engine services
		mav.addObject("datastore", DatastoreServiceFactory.datastoreService)
		mav.addObject("memcache", MemcacheServiceFactory.memcacheService)
		mav.addObject("urlFetch", URLFetchServiceFactory.URLFetchService)
		mav.addObject("mail", MailServiceFactory.mailService)
		mav.addObject("images", ImagesServiceFactory.imagesService)
		
		// bind user service and current user
		UserService userService = UserServiceFactory.userService
		mav.addObject("users", userService)
		mav.addObject("user", userService.getCurrentUser())

		// New in GAE SDK 1.2.5: task queues
		mav.addObject("defaultQueue", QueueFactory.getDefaultQueue())
		mav.addObject("queues", new QueueAccessor())

		// New in GAE SDK 1.2.5: XMPP support
		mav.addObject("xmpp", XMPPServiceFactory.getXMPPService())

		// Tells whether the application is running in local development mode
		// or is deployed on Google's cloud
		mav.addObject("localMode", ApiProxy.currentEnvironment.class.name.contains("LocalHttpRequestEnvironment"))

		// New in GAE SDK 1.3.0: blobstore support
		mav.addObject("blobstore", BlobstoreServiceFactory.blobstoreService)

		// ** copied from PluginsHandler.enrich **
		PluginsHandler.instance.bindingVariables.each { String k, Object v -> mav.addObject(k, v) }
	}
}
