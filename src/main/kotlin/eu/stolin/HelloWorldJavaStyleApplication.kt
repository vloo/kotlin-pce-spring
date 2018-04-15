package eu.stolin

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration


@Configuration
@ComponentScan(basePackages = ["eu.stolin"])
class HelloWorldJavaStyleApplication

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(HelloWorldJavaStyleApplication::class.java)
    val printer = context.getBean(HelloWorldJavaStyle::class.java)
    println(printer.helloWorld())
}