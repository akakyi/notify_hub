package notifier.hub.notifyhub.entrypoint

import notifier.hub.notifyhub.entrypoint.dto.ChannelPayload
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class RabbitNewChannelListener(
) {

    private val log = LoggerFactory.getLogger(RabbitNewChannelListener::class.java)

    @RabbitListener(ackMode = "AUTO", queues = ["\${amqp.channel.key}"])
    fun forNotify(request: ChannelPayload) {
        log.info("Got new channel message: $request")

    }

}
