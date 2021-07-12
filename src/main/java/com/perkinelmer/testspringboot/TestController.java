package com.perkinelmer.testspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/test")
public class TestController {
    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String ping() {
        return "Test server is up";
    }
}
