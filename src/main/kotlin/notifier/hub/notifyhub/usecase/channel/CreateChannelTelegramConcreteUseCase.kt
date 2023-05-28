package notifier.hub.notifyhub.usecase.channel

import notifier.hub.notifyhub.dataprovider.relational.channel.ChannelEntity
import notifier.hub.notifyhub.dataprovider.relational.channel.ChannelRepository
import notifier.hub.notifyhub.model.ChannelType
import notifier.hub.notifyhub.usecase.dto.channel.CreateChannelConcreteInDto
import org.springframework.stereotype.Component

@Component
class CreateChannelTelegramConcreteUseCase(
    private val channelRepository: ChannelRepository
) : CreateChannelConcrete {

    override fun execute(inDto: CreateChannelConcreteInDto) {
        channelRepository.findById(inDto.globalChannelId)
            .ifPresent {
                throw RuntimeException("Channel with id ${inDto.globalChannelId} already exist")
            }

        channelRepository.save(
            ChannelEntity(
                //TODO айдишник чата создаётся снаружи. Это хуёво. Разнести: просто уведомить о создании канала хаб, хаб уже отправляет инфу о связке с выставленным глобал-айдишником
                channelId = inDto.globalChannelId,
                globalUserId = inDto.globalUserId,
                channelName = inDto.channelName,
                channelType = ChannelType.TELEGRAM
            )
        )
    }

    override fun support(type: ChannelType) = type == ChannelType.TELEGRAM

}
