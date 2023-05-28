package notifier.hub.notifyhub.entrypoint.dto

data class CreateNewUserRequest(
    val login: String,
    val pas: ByteArray
)
