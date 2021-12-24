class Page(
    override val type: String = "Page",
    val id: Int,
    val groupId: Int,
    val title: String
) : Attachment