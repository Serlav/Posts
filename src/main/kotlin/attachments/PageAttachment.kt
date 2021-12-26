package attachments

import Page

class PageAttachment(
    override val type: String = "page",
    val page: Page
) : Attachment