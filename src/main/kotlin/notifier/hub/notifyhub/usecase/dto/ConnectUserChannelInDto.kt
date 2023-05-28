package notifier.hub.notifyhub.usecase.dto

import java.util.*

data class ConnectUserChannelInDto(
    val globalUserId: UUID,
    val userChannelId: String
)
