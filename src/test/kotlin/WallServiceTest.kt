import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        //arrange
        val post = Post(id = 1)

        //act
        val result = WallService.add(
            post = post
        )

        //assert
        assertEquals(post, result)
    }


    @Test
    fun update_true() {
        //arrange
        val service = WallService

        service.add(Post(id = 1))
        service.add(Post(id = 2))
        service.add(Post(id = 3))

        //act
        val update = Post(id = 2)
        val result = service.update(update)

        //  assert
        assertTrue(result)
    }


    @Test
    fun update_false() {
        //arrange
        val service = WallService

        service.add(Post(id = 1))
        service.add(Post(id = 2))
        service.add(Post(id = 3))

        //act
        val update = Post(id = 5)
        val result = service.update(update)

        //  assert
        assertFalse(result)
    }
}