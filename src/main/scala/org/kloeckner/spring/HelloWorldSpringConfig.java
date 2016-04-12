package org.kloeckner.spring;

import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldSpringConfig {

   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}
