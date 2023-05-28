package notifier.hub.notifyhub.entrypoint.amqp

import notifier.hub.notifyhub.entrypoint.dto.ChannelPayload
import notifier.hub.notifyhub.usecase.channel.CreateChannelUseCase
import notifier.hub.notifyhub.usecase.dto.channel.CreateChannelInDto
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class RabbitNewChannelListener(
    private val createChannelUseCase: CreateChannelUseCase
) {

    private val log = LoggerFactory.getLogger(RabbitNewChannelListener::class.java)

    @RabbitListener(ackMode = "AUTO", queues = ["\${amqp.channel.key}"])
    fun forNotify(request: ChannelPayload) {
        log.info("Got new channel message: $request")

        createChannelUseCase.execute(
            CreateChannelInDto(
                globalChannelId = request.globalChannelId,
                globalUserId = request.globalUserId,
                channelName = request.channelName,
                channelType = request.channelType
            )
        )
    }

}
