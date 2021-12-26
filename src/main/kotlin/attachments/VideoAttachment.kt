package attachments

import Video

class VideoAttachment(
    override val type: String = "video",
    val video: Video
) : Attachment