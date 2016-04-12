package org.kloeckner.spring;

import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldSpringConfig {

   @Bean 
   public HelloWorld helloWorld(){
      HelloWorld helloWorld = new HelloWorld();
      helloWorld.setMessage("Hello Scala-World!");
      return helloWorld;
   }
}
