package notifier.hub.notifyhub.dataprovider.relational.channel

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ChannelRepository : JpaRepository<ChannelEntity, UUID>
