package notifier.hub.notifyhub.usecase.connect

import notifier.hub.notifyhub.dataprovider.amqp.usercreation.CreateTelegramUserDataProvider
import notifier.hub.notifyhub.dataprovider.amqp.usercreation.CreateTelegramUserPayload
import notifier.hub.notifyhub.model.ChannelType
import notifier.hub.notifyhub.usecase.dto.connect.ConnectUserConcreteInDto
import org.springframework.stereotype.Component

@Component
class ConnectTelegramUserConcreteUseCase(
    private val createTelegramUserDataProvider: CreateTelegramUserDataProvider
) : ConnectUserConcrete {

    override fun execute(inDto: ConnectUserConcreteInDto) {
        createTelegramUserDataProvider.sendUserData(
            CreateTelegramUserPayload(
                globalUserId = inDto.globalUserId,
                telegramId = inDto.userInChannelId
            )
        )
    }

    override fun support(type: ChannelType) = type == ChannelType.TELEGRAM

}
