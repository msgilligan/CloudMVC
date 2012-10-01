package com.msgilligan.cloudmvc.controller

import spock.lang.*

class TestGroovyHelloWorldController extends spock.lang.Specification {
    def "quick test of GroovyHelloWorldController"() {
        def ctlr = new GroovyHelloWorldController()
        expect:
        ctlr.helloWorld().viewName == "helloworld.jsp"
    }
}
