package notifier.hub.notifyhub.usecase.channel

import notifier.hub.notifyhub.usecase.dto.channel.CreateChannelConcreteInDto
import notifier.hub.notifyhub.usecase.dto.channel.CreateChannelRegistryInDto
import org.springframework.stereotype.Service

@Service
class CreateChannelRegistry(
    private val useCases: List<CreateChannelConcrete>
) {

    fun execute(inDto: CreateChannelRegistryInDto) {
        val useCase = useCases.firstOrNull {
            it.support(inDto.channelType)
        } ?: throw RuntimeException("Not found supporting connection component for type ${inDto.channelType}")

        useCase.execute(
            CreateChannelConcreteInDto(
                globalUserId = inDto.globalUserId,
                globalChannelId = inDto.globalChannelId,
                channelName = inDto.channelName
            )
        )
    }

}
