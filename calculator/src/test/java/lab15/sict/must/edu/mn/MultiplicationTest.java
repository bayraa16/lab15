// package lab15.sict.must.edu.mn;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// public class MultiplicationTest {
//     @Test
//     void testMultiplyPositive() {
//         Multiplication calc = new Multiplication();
//         assertEquals(6.0, calc.multiply(2.0, 3.0));
//     }

//     @Test
//     void testMultiplyNegative() {
//         Multiplication calc = new Multiplication();
//         assertEquals(-6.0, calc.multiply(-2.0, 3.0));
//     }
// }


package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {
    @Test
    void testMultiplyPositive() {
        Multiplication calc = new Multiplication();
        assertEquals(6.0, calc.multiply(2.0, 3.0));
    }

    @Test
    void testMultiplyNegative() {
        Multiplication calc = new Multiplication();
        assertEquals(-6.0, calc.multiply(-2.0, 3.0));
    }

    @Test
    void testMultiplyWithZero() {
        Multiplication calc = new Multiplication();
        assertEquals(0.0, calc.multiply(0.0, 5.0)); // Шинэ тест нэмсэн
    }
    @Test
    void testMultiplyWithNegativeZero() {
        Multiplication calc = new Multiplication();
        assertEquals(0.0, calc.multiply(0.0, 0.0)); // Шинэ тест нэмсэн
    }
}
