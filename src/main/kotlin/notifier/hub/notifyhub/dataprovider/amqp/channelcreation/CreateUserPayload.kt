package notifier.hub.notifyhub.dataprovider.amqp.channelcreation

import java.util.*

data class CreateUserPayload(
    val globalUserId: UUID,
    val userChannelId: String
)
