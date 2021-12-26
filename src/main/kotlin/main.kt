import attachments.Attachment

fun main() {

    val original = Post(id = 2)
    println(original)
    WallService.add(original)
    WallService.update(original)

    println(original)
}

object WallService {
    private var wall = emptyArray<Post>()

    fun add(post: Post): Post {
        if (wall.isEmpty()) {
            post.id = 0
        } else {
            post.id = wall.last().id + 1
        }
        wall += post
        return wall.last()
    }

    fun update(newPost: Post): Boolean {
        var idTrue = false
        for ((index, post) in wall.withIndex()) {
            if (newPost.id == post.id) {
                wall[index] = newPost.copy(ownerId = post.ownerId, date = post.date)
                idTrue = true
            }
        }
        return idTrue
    }
}

data class Post(
    var id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: Int = 0,
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = true,
    val comments: Comments = Comments(),
    val copyright: Copyright = Copyright(),
    val likes: Likes = Likes(),
    val reposts: Reposts = Reposts(),
    val views: Views = Views(),
    val postType: String = "",
    val signerId: Int = 0,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val donut: Donat = Donat(),
    val postponedId: Int = 0,
    val attachments: Array<Attachment>? = null
)

class Comments(
    val count: Int = 0,
    val canPost: Boolean = true,
    val groupsCanPost: Boolean = true,
    val canClose: Boolean = true,
    val canOpen: Boolean = true
)

class Copyright(
    val id: Int = 0,
    val link: String = " ",
    val name: String = " ",
    val type: String = " "
)

class Likes(
    val count: Int = 0,
    val userLikes: Boolean = true,
    val canLike: Boolean = true,
    val canPublish: Boolean = true
)

class Reposts(
    val count: Int = 0,
    val userReposted: Boolean = true
)

class Views(
    val count: Int = 0
)

class Donat(
    val is_donut: Boolean = true,
    val paidDuration: Int = 0,
    val placeholder: String = " ",
    val canPublishFreeCopy: Boolean = true,
    val edit_mode: String = " ",
    val all: String = " ",
    val duration: Int = 0
)