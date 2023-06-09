package notifier.hub.notifyhub.dataprovider.amqp.usercreation

import org.springframework.amqp.core.MessageProperties
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.amqp.support.converter.MessageConverter
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class CreateTelegramUserDataProvider(
    private val rabbitTemplate: RabbitTemplate,
    private val messageConverter: MessageConverter,
    @Value("\${amqp.create.telegram.key}") private val channelRoutingKey: String
) {

    fun sendUserData(payload: CreateTelegramUserPayload) {
        rabbitTemplate.send(
            channelRoutingKey,
            messageConverter.toMessage(
                payload, MessageProperties()
            )
        )
    }

}
