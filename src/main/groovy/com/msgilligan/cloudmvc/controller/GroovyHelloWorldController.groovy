package com.msgilligan.cloudmvc.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Controller
@groovy.transform.CompileStatic
public class GroovyHelloWorldController {
	protected final Log logger = LogFactory.getLog(getClass())

	@RequestMapping("/helloWorldGroovy")
	public ModelAndView helloWorld(){
		logger.info("Return View")
		new ModelAndView("helloworld.jsp")
	}
}
