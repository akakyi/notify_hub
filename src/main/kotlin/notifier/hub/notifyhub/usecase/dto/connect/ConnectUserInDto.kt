package notifier.hub.notifyhub.usecase.dto.connect

import notifier.hub.notifyhub.model.ChannelType
import java.util.*

data class ConnectUserInDto(
    val globalUserId: UUID,
    val userInChannelId: String,
    val channelType: ChannelType
)
