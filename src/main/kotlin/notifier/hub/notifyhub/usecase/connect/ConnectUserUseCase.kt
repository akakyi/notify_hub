package notifier.hub.notifyhub.usecase.connect

import notifier.hub.notifyhub.usecase.dto.connect.ConnectUserInChannelRegistryInDto
import notifier.hub.notifyhub.usecase.dto.connect.ConnectUserInDto
import org.springframework.stereotype.Service

@Service
class ConnectUserUseCase(
    private val connectUserRegistry: ConnectUserRegistry
) {

    fun execute(inDto: ConnectUserInDto) {
        connectUserRegistry.execute(
            ConnectUserInChannelRegistryInDto(
                globalUserId = inDto.globalUserId,
                userChannelId = inDto.userInChannelId,
                channelType = inDto.channelType
            )
        )
    }

}
