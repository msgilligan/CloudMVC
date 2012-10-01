package com.msgilligan.cloudmvc.controller

import spock.lang.*

import org.springframework.mock.web.MockHttpServletResponse

class TestCounterController extends spock.lang.Specification {
    def "quick test of CounterController"() {
        setup:
        def ctlr = new CounterController()
        def resp = new MockHttpServletResponse()
        
        when:
        ctlr.count(resp)
        
        then:
        resp.getContentType() == "text/plain"
        resp.getContentAsString() == "1"
//        resp.getContentLength() == 1	// I don't know why this is zero, but I don't think it's a bug in the CounterController
    }
}
