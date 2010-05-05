package com.msgilligan.cloudmvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController
{
	protected final Log logger = LogFactory.getLog(getClass());

    private int count = 0;

	@RequestMapping("/counter")
	public void count(HttpServletResponse resp) throws IOException
	{
//		logger.info("CounterController.count");
		
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        
        count++;
        out.print(Integer.toString(count));
	}
}
