package notifier.hub.notifyhub.usecase.dto

import java.util.*

data class ConnectUserConcreteInDto(
    val globalUserId: UUID,
    val userInChannelId: String
)
