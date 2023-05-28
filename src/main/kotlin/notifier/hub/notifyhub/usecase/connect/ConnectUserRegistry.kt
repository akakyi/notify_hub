package notifier.hub.notifyhub.usecase.connect

import notifier.hub.notifyhub.usecase.dto.ConnectUserConcreteInDto
import notifier.hub.notifyhub.usecase.dto.ConnectUserInChannelRegistryInDto
import org.springframework.stereotype.Service

@Service
class ConnectUserRegistry(
    private val useCases: List<ConnectUserConcrete>
) {

    fun execute(inDto: ConnectUserInChannelRegistryInDto) {
        val useCase = useCases.firstOrNull {
            it.support(inDto.channelType)
        } ?: throw RuntimeException("Not found supporting connection component for type ${inDto.channelType}")

        useCase.execute(
            ConnectUserConcreteInDto(
                globalUserId = inDto.globalUserId,
                userInChannelId = inDto.userChannelId
            )
        )
    }

}
