class Event(
    override val type: String = "Event",
    val id: Long,
    val time: Int,
    val memberStatus: Int = 3,
    val isFavorite: Boolean = false,
    val address: String,
    val text: String,
    val buttonText: String,
    val friends: Int
) : Attachment