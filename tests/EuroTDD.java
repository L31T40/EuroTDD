import com.es2.tdd.End;
import com.es2.tdd.Euro;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EuroTDD {

    @BeforeEach
    void setUp() {
    }

    @AfterAll
      static void tearDown() {
        new End();
    }

    @Test
    void testEuroObjectCreation(){
        Euro tenEuros = new Euro(1000);
    }

    @Test
    void testEuroToString(){
        Euro twoEuros = new Euro(200);
        assertEquals("EUR 2,00", twoEuros.toString());

        twoEuros = new Euro(250);
        assertEquals("EUR 2,50", twoEuros.toString());
    }

    @Test
    void testEuroEquality() {
        Euro twoEuros = new Euro(200);
        Euro twoEuros2 = new Euro(200);

        assertTrue(twoEuros.equals(twoEuros2));
    }

    @Test
    void testEuroInequality() {
        Euro twoEuros = new Euro(300);
        Euro sixEuros = new Euro(600);

        assertFalse(twoEuros.equals(sixEuros));
    }

    @Test
    void testEuroEqualsDifferentObject() {
        Euro twoEuros = new Euro(200);
        int twoEuros2 = 200;

        assertFalse(twoEuros.equals(twoEuros2));
    }

    @Test
    void testSubtraction() {
        Euro twoEuros = new Euro(200);
        int oneEuro = 100;

        System.out.print(twoEuros.minus(oneEuro));

        assertTrue(new Euro(100).equals(twoEuros.minus(oneEuro)));
    }


}