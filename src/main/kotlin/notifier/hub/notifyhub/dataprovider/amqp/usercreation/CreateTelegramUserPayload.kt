package notifier.hub.notifyhub.dataprovider.amqp.usercreation

import java.util.*

data class CreateTelegramUserPayload(
    val globalUserId: UUID,
    val telegramId: String
)
