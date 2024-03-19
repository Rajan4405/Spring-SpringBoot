package com.leranspring.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor,
// equals, hashcode and toString are automatically created.
// Released in JDK 16.
record Person(String name, int age, Address address) {
}

// Address -firstLine & city
record Address(String firstLine, String city) {
}

@Configuration
public class HelloWorldConfiguration {

   @Bean
   public String name() {
      return "Rajan";
   }

   @Bean
   public int age() {
      return 23;
   }

   @Bean
   @Primary
   public Person person() {
      return new Person("Ravi", 21, new Address("Butwal", "Devinagar"));
   }

   @Bean
   public Person person2MethodCall() {
      return new Person(name(), age(), new Address("Manigram", "4.no"));
   }

   @Bean
   public Person person3Parameter(String name, int age, Address address2) {
      return new Person(name, age, address2);
   }

   @Bean
   public Person person4Parameter(String name, int age, Address address) {
      return new Person(name, age, address);
   }

   @Bean(name = "address2")
   public Address address() {
      return new Address("Baker Street", "London");

   }
}
