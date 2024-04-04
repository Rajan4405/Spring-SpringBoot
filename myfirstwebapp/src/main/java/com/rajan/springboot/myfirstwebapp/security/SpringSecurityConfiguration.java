package com.rajan.springboot.myfirstwebapp.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
  // TODO: Add security configuration here
  // LDAP or Database
  // In Memory

  // InMemoryUserDetailsManager userDetailsManager = new
  // InMemoryUserDetailsManager();

  @Bean
  public InMemoryUserDetailsManager createUserDetailsManager() {
    // userDetailsManager.createUser(User.withUsername("quick
    // coder").password("<PASSWORD>").roles("USER").build());
    // return userDetailsManager;

    Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);

    UserDetails userDetails = User.builder()
        .passwordEncoder(passwordEncoder)
        .username("rajan").password("dummy").roles("USER", "ADMIN").build();
    return new InMemoryUserDetailsManager(userDetails);
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
