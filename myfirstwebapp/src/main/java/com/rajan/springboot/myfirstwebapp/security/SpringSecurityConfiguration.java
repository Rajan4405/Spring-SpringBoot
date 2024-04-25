package com.rajan.springboot.myfirstwebapp.security;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

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

    UserDetails userDetails1 = createNewUser("rajan", "dummy");
    UserDetails userDetails2 = createNewUser("coder", "dummy");
    return new InMemoryUserDetailsManager(userDetails1, userDetails2);
  }

  private UserDetails createNewUser(String username, String password) {
    Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);

    UserDetails userDetails = User.builder()
        .passwordEncoder(passwordEncoder)
        .username(username).password(password).roles("USER", "ADMIN").build();
    return userDetails;
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  // ALL URLs are protected
  // A login form is shown for unauthorized requests
  // CSRF disable
  // Frames

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(
        authorize -> authorize.anyRequest().authenticated());
    http.formLogin(withDefaults());

    http.csrf().disable();
    http.headers().frameOptions().disable();
    return http.build();
  }
}
