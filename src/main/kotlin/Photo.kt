class Photo(
    override val type: String = "Photo",
    val id: Int,
    val ownerId: Int,
    val photo130: String,
    val photo604: String
) : Attachment