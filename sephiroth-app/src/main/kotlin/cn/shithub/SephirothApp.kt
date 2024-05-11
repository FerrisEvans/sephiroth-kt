package cn.shithub

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SephirothApp

fun main(args: Array<String>) {
    runApplication<SephirothApp>(*args)
}