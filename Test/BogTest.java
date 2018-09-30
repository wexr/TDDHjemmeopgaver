import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BogTest {

    @Test
    void testBogTitleEqualsJava() {
        //3. Arrange
        Bog bog = new Bog();
        bog.setTitle("Java: how to program");

        //2. Act
        String title = bog.getTitle();

        //1 Assert
        assertEquals("Java: how to program", title);

    }

    @Test
    void testFakeBogTitleEqualsBeginning() {
        //3. Arrange
        Bog bog = new Bog();
        bog.setTitle("Beginning Java 2");

        //2. Act
        String title = bog.getTitle();

        //1. Assert
        assertEquals("Beginning Java 2", title);

    }
}