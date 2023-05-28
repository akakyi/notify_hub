package notifier.hub.notifyhub.usecase

import notifier.hub.notifyhub.model.ChannelType
import notifier.hub.notifyhub.usecase.dto.ConnectUserChannelInDto

interface ConnectUserChannel {

    fun execute(inDto: ConnectUserChannelInDto)

    fun support(type: ChannelType): Boolean

}
