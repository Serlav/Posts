package attachments

import Event

class EventAttachment(
    override val type: String = "event",
    val event: Event
) : Attachment