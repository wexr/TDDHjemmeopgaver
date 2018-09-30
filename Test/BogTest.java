import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BogTest {

    @Test
    void testBogTitleEqualsJava() {
        //3. Arrange
        Bog bog = new Bog();

        //2. Act
        String title = bog.title();

        //1 Assert
        assertEquals("Java: how to program", title);

    }

    @Test
    void testFakeBogTitleEqualsBeginning() {

    }
}