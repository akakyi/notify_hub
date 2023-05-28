package notifier.hub.notifyhub.usecase.channel

import notifier.hub.notifyhub.model.ChannelType
import notifier.hub.notifyhub.usecase.dto.channel.CreateChannelConcreteInDto

interface CreateChannelConcrete {

    fun execute(inDto: CreateChannelConcreteInDto)

    fun support(type: ChannelType): Boolean

}
