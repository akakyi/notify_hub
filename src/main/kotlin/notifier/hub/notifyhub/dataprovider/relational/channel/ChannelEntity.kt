package notifier.hub.notifyhub.dataprovider.relational.channel

import notifier.hub.notifyhub.model.ChannelType
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "channel")
class ChannelEntity(
    @Id
    @field:Column(name = "id")
    val channelId: UUID,
    @field:Column(name = "global_user_id")
    val globalUserId: UUID,
    //TODO перегнать в json
    @field:Column(name = "channel_name")
    val channelName: String,
    @field:Column(name = "channel_type")
    val channelType: ChannelType
)
