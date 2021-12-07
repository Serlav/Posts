import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add(post: Post) {
        //arrange
        val post = Post()

        //act
        val result = add(
            post = post
        )

        //assert
        assertEquals(1, result)
    }
}