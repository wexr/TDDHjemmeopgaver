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

    @Test
    void testBogForfatterEqualsDeitel() {
        //3.
        Bog bog = new Bog();
        bog.setAuthor("Deitel & Deitel");

        //2. act
        String author = bog.getAuthor();

        //1. Assert
        assertEquals("Deitel & Deitel", author);

    }

    @Test
    void testFakeBogForfatterEqualsIvor() {
        //3. Arrange
        Bog bog = new Bog();
        bog.setAuthor("Ivor Horton");

        //2. Act
        String author = bog.getAuthor();

        //1. Assert
        assertEquals("Ivor Horton", author);

    }

    @Test
    void testBogPrisEquals497() {

        //3. Arrange
        Bog bog = new Bog();
        bog.setPrice(497);

        //2. Act
        int pris = bog.getPrice();

        //1. Assert
        assertEquals(497, pris);

    }

    @Test
    void testFakeBogPrisEquals495() {

        //3. Arrange
        Bog bog = new Bog();
        bog.setPrice(495);

        //2. Act
        int pris = bog.getPrice();

        //1. Assert
        assertEquals(495, pris);

    }

    @Test
    void testStringAfBogEquals() {

        //3. Arrange
        Bog bog = new Bog();
        bog.nyBog("NAVN", "FORFATTER", 0);
        //2. Act
        String tekst = bog.toString();
        //1. Assert
        assertEquals("Navn på bog: NAVN\n Forfatter: FORFATTER\n Pris: 0,-", tekst);

    }

    @Test
    void testFakeStringAfBogEquals() {
        //3. Arrange
        Bog bog = new Bog();
        bog.nyBog("Java: how to program", "Deitel & Deitel", 497);

        //2. Act
        String tekst = bog.toString();

        //1. Assert
        assertEquals("Navn på bog: Java: how to program\n Forfatter: Deitel & Deitel\n Pris: 497,-", tekst);
    }
}