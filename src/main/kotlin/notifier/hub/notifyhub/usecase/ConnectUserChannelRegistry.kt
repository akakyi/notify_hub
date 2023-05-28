package notifier.hub.notifyhub.usecase

import notifier.hub.notifyhub.usecase.dto.ConnectUserChannelRegistryInDto
import org.springframework.stereotype.Service

@Service
class ConnectUserChannelRegistry(
    private val useCases: List<ConnectUserChannel>
) {

    fun execute(inDto: ConnectUserChannelRegistryInDto) {
        val useCase = useCases.firstOrNull {
            it.support(inDto.channelType)
        } ?: throw RuntimeException("Not found supporting mechanizm for type ${inDto.channelType}")
    }

}
