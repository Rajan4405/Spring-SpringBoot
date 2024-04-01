package com.rajan.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

  private LoginAuthenticationService loginAuthenticationService;

  // login
  // GET, POST
  @RequestMapping(value = "login", method = RequestMethod.GET)
  public String Login() {
    return "login";
  }

  public LoginController(LoginAuthenticationService loginAuthenticationService) {
    super();
    this.loginAuthenticationService = loginAuthenticationService;
  }

  @RequestMapping(value = "login", method = RequestMethod.POST)
  public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
    model.put("name", name);
    model.put("password", password);

    // Authentication
    // name - rajan
    // password - dummy

    if (loginAuthenticationService.authenticate(name, password)) {
      return "welcome";
    } else {
      model.put("error", "Invalid username or password");
      return "login";
    }
  }
}
