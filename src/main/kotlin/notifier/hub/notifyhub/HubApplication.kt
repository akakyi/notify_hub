package notifier.hub.notifyhub

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//TODO разделить на два сервиса: один заводит юзверей, другой чаннелы
@SpringBootApplication
class HubApplication

fun main(args: Array<String>) {
	runApplication<HubApplication>(*args)
}
