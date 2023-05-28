package notifier.hub.notifyhub.usecase.connect

import notifier.hub.notifyhub.model.ChannelType
import notifier.hub.notifyhub.usecase.dto.connect.ConnectUserConcreteInDto

interface ConnectUserConcrete {

    fun execute(inDto: ConnectUserConcreteInDto)

    fun support(type: ChannelType): Boolean

}
