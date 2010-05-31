package com.msgilligan.cloudmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Controller
public class HelloWorldController{
	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping("/helloWorld")
	public ModelAndView helloWorld(){
		logger.info("Return View");
		return new ModelAndView("helloworld.jsp");
	}
}
