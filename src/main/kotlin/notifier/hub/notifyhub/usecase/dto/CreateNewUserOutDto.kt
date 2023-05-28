package notifier.hub.notifyhub.usecase.dto

import java.util.*

data class CreateNewUserOutDto(
    val globalUserId: UUID,
    val login: String
)
