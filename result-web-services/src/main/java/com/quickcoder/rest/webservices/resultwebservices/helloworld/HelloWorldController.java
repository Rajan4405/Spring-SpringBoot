package com.quickcoder.rest.webservices.resultwebservices.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// Rest API
@RestController
public class HelloWorldController {

  // /hellow-world

  @RequestMapping(path = "/hellow-world", method = RequestMethod.GET)
  public String helloWorld() {
    return "Hello World!";
  }
}