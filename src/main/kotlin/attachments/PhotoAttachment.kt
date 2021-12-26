package attachments

import Photo

class PhotoAttachment(
    override val type: String = "photo",
    val photo: Photo
) : Attachment