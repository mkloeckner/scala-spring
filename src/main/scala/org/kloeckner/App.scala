package org.kloeckner

import org.kloeckner.spring.{MessagePrinter, MessageService}
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.{AnnotationConfigApplicationContext, Bean, ComponentScan, Configuration}

/**
  * Created by martin on 12.04.16.
  */
@Configuration
@ComponentScan(basePackages = Array("org.kloeckner.spring"))
object App {

  @Bean def mockMessageService: MessageService = {
    return new MessageService() {
      def getMessage: String = {
        return "Hello World!"
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val context: ApplicationContext = new AnnotationConfigApplicationContext(classOf[Application])
    val printer: MessagePrinter = context.getBean(classOf[MessagePrinter])
    printer.printMessage()
  }
}
