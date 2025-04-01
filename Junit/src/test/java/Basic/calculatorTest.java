package Basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

calculator c=new calculator();

    @Test
    void testAdd() {
        assertEquals(3,2,1);
    }

    @Test
    void subtract() {
        assertEquals(1,2,1);
    }

    @Test
    void multiply() {
        assertEquals(3,2,1);
    }

    @Test
    void divide() {
        assertEquals(2,2,4);
    }
}