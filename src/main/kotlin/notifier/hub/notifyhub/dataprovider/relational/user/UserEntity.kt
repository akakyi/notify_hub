package notifier.hub.notifyhub.dataprovider.relational.user

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user")
open class UserEntity(
    @Id
    @Column(name = "global_user_id")
    val globalUserId: UUID,

    val login: String,

    val pas: String
) {

}
