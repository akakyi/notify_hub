package notifier.hub.notifyhub.entrypoint.dto

import notifier.hub.notifyhub.model.ChannelType
import java.util.*

data class ConnectUserRequest(
    val globalUserId: UUID,
    //TODO обернуть в json
    val channelUserId: String,
    val channelType: ChannelType
)
