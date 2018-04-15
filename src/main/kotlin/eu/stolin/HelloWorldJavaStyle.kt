package eu.stolin

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class HelloWorldJavaStyle {

    @Autowired
    lateinit var helloService: HelloService

    @Autowired
    lateinit var worldService: WorldService

    fun helloWorld(): String {
        return helloService.hello() + " " + worldService.world()
    }
}