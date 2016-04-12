package org.kloeckner;

import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldSpringConfig {

   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}
