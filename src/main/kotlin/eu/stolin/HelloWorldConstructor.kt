package eu.stolin

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

//ruzne modifikace

//@Component
//class HelloWorldConstructor constructor(@Autowired var helloService: HelloService,
//                                        @Autowired val worldService: WorldService) {

//nebo lepe
//@Component
//class HelloWorldConstructor @Autowired constructor(var helloService: HelloService,
//                                                   val worldService: WorldService) {

//ale uplne nejlepsi je tohle

@Component
class HelloWorldConstructor (var helloService: HelloService,
                             val worldService: WorldService) {

    fun helloWorld(): String {
        return helloService.hello() + " " + worldService.world()
    }
}