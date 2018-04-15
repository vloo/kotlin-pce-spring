package eu.stolin

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["eu.stolin"])
class HelloWorldConstructorApplication

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(HelloWorldJavaStyleApplication::class.java)
    val printer = context.getBean(HelloWorldConstructor::class.java)
    println(printer.helloWorld())
}