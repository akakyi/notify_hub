package notifier.hub.notifyhub.usecase.dto.connect

import notifier.hub.notifyhub.model.ChannelType
import java.util.*

data class ConnectUserInChannelRegistryInDto(
    val globalUserId: UUID,
    val userChannelId: String,
    val channelType: ChannelType
)
