package Basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathOperationsTest {

    MathOperations math = new MathOperations();

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> math.divide(5, 0)); // Expect an exception
    }
}