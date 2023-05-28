package notifier.hub.notifyhub.entrypoint.dto

import java.util.*

data class ChannelPayload(
    val globalChannelId: UUID,
    val globalUserId: UUID,
    val channelName: String
)
