package notifier.hub.notifyhub.usecase.dto

import notifier.hub.notifyhub.model.ChannelType
import java.util.*

data class ConnectUserChannelRegistryInDto(
    val globalUserId: UUID,
    val userChannelId: String,
    val channelType: ChannelType
)
