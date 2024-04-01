package com.rajan.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class LoginAuthenticationService {
  public boolean authenticate(String username, String password) {
    boolean isValidUserName = username.equals("rajan");
    boolean isValidPassword = password.equals("dummy");

    return isValidUserName && isValidPassword;

  }
}
