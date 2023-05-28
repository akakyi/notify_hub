package notifier.hub.notifyhub.usecase.dto.connect

import java.util.*

data class ConnectUserConcreteInDto(
    val globalUserId: UUID,
    val userInChannelId: String
)
