package attachments

import App

class AppAttachment(
    override val type: String = "app",
    val app: App
) : Attachment