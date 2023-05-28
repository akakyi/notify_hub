package notifier.hub.notifyhub.entrypoint.rest

import notifier.hub.notifyhub.entrypoint.dto.ConnectUserRequest
import notifier.hub.notifyhub.entrypoint.dto.CreateNewUserRequest
import notifier.hub.notifyhub.entrypoint.dto.CreateNewUserResponse
import notifier.hub.notifyhub.usecase.CreateNewUserUseCase
import notifier.hub.notifyhub.usecase.connect.ConnectUserUseCase
import notifier.hub.notifyhub.usecase.dto.connect.ConnectUserInDto
import notifier.hub.notifyhub.usecase.dto.CreateNewUserInDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/user"])
class UserController(
    private val createNewUserUseCase: CreateNewUserUseCase,
    private val connectUserUseCase: ConnectUserUseCase
) {

    @PostMapping("/create")
    fun create(request: CreateNewUserRequest): CreateNewUserResponse {
        val result = createNewUserUseCase.execute(
            CreateNewUserInDto(
                login = request.login,
                pas = request.pas
            )
        )

        return CreateNewUserResponse(
            globalUserId = result.globalUserId,
            login = result.login
        )
    }

    @PostMapping("/connect")
    fun connectUser(request: ConnectUserRequest) {
        connectUserUseCase.execute(
            ConnectUserInDto(
                globalUserId = request.globalUserId,
                userInChannelId = request.channelUserId,
                channelType = request.channelType
            )
        )
    }

}
