package com.rajan.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  // Logger
  private Logger logger = LoggerFactory.getLogger(getClass());

  @RequestMapping("login")
  public String Login(@RequestParam String name, ModelMap model) {
    model.put("name", name);
    logger.debug("Request param is {}", name);
    logger.info("i want this printed at info level", name);
    return "login";
  }
}
