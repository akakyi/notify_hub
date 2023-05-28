package notifier.hub.notifyhub.entrypoint.dto

import java.util.*

data class CreateNewUserResponse(
    val globalUserId: UUID,
    val login: String
)
