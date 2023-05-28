package notifier.hub.notifyhub.usecase.channel

import notifier.hub.notifyhub.usecase.dto.channel.CreateChannelInDto
import notifier.hub.notifyhub.usecase.dto.channel.CreateChannelRegistryInDto
import org.springframework.stereotype.Service

@Service
class CreateChannelUseCase(
    private val createChannelRegistry: CreateChannelRegistry
) {

    fun execute(inDto: CreateChannelInDto) {
        createChannelRegistry.execute(
            CreateChannelRegistryInDto(
                globalChannelId = inDto.globalChannelId,
                globalUserId = inDto.globalUserId,
                channelName = inDto.channelName,
                channelType = inDto.channelType
            )
        )
    }

}
