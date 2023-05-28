package notifier.hub.notifyhub.usecase

import notifier.hub.notifyhub.dataprovider.relational.user.UserEntity
import notifier.hub.notifyhub.dataprovider.relational.user.UserRepository
import notifier.hub.notifyhub.usecase.dto.CreateNewUserInDto
import notifier.hub.notifyhub.usecase.dto.CreateNewUserOutDto
import org.springframework.stereotype.Service
import java.util.*

@Service
class CreateNewUserUseCase(
    private val userRepository: UserRepository,
//    private val passwordEncoder: PasswordEncoder
) {

    fun execute(inDto: CreateNewUserInDto): CreateNewUserOutDto {
        val pas = encodePas(inDto.pas)
        val saved = userRepository.save(
            UserEntity(
                globalUserId = UUID.randomUUID(),
                login = inDto.login,
                pas = pas
            )
        )

        return CreateNewUserOutDto(
            globalUserId = saved.globalUserId,
            login = saved.login
        )
    }

    private fun encodePas(password: ByteArray) = String(password)

}
