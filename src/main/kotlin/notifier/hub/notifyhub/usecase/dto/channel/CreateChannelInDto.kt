package notifier.hub.notifyhub.usecase.dto.channel

import notifier.hub.notifyhub.model.ChannelType
import java.util.*

data class CreateChannelInDto(
    //TODO айдишник чата создаётся снаружи. Это хуёво. Разнести: просто уведомить о создании канала хаб, хаб уже отправляет инфу о связке с выставленным глобал-айдишником
    val globalChannelId: UUID,
    val globalUserId: UUID,
    val channelName: String,
    val channelType: ChannelType
)
