package notifier.hub.notifyhub.usecase.dto

data class CreateNewUserInDto(
    val login: String,
    val pas: ByteArray
//    //TODO айдишник телеги, гмейла, вк и тд и тп. Хреново, что он тут, но пока хз как по другому развести это
//    val userChannelId: String
)
