package org.kloeckner.spring

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
  * Created by martin on 13.04.16.
  */
@Component
class HelloWorldConsumer {

  @Autowired
  var hw: HelloWorld = _

}
