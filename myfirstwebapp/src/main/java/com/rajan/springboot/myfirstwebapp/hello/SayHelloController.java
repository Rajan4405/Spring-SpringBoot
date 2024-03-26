package com.rajan.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
  // "say-hello" => "Hello! What are you learning today? "

  @RequestMapping("say-hello")
  @ResponseBody
  public String sayHello() {
    return "Hello! What are you learning today? ";
  }

  @RequestMapping("say-hello-html")
  @ResponseBody
  public String sayHelloHtml() {
    StringBuffer sb = new StringBuffer();
    sb.append("<html> <body><title>Hello</title><h1>Hello! HTML?</h1><body> </html>");
    return sb.toString();
  }

  // JSP File - 'say-hello.jsp'
  @RequestMapping("say-hello-jsp")
  public String sayHelloJsp() {
    return "sayHello";
  }

}
