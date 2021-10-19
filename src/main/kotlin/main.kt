fun main() {
}

object WallService{
    private var posts = emptyArray<Post>()

    fun add(post:Post):Post{
        posts += post
        return posts.last()
    }
}

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: Int,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean = true,
    val donut: Donat,
    val postponedId: Int
)

class Comments(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)

class Copyright(
    val id: Int,
    val link: String,
    val name: String,
    val type: String
)

class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
)

class Reposts(
    val count: Int,
    val userReposted: Boolean
)

class Views(
    val count: Int
)

class Donat(
    val is_donut: Boolean,
    val paidDuration: Int,
    val placeholder: String,
    val canPublishFreeCopy: Boolean,
    val edit_mode: String,
    val all: String,
    val duration: Int
)