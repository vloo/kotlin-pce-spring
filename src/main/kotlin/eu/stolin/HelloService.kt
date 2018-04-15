package eu.stolin

import org.springframework.stereotype.Component

@Component
class HelloService {

    fun hello(): String {
        return "hello"
    }
}