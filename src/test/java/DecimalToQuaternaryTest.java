import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecimalToQuaternaryTest {
    @Test
    void testDecimalToQuaternary() {
        Quaternary quaternary = new Quaternary();
        int testIntOne = 27;
        int testIntTwo = 1;
        int testIntThree = 13;
        int testIntFour = 36;
        int qTestOne = quaternary.decimalToQuaternary(testIntOne);
        int qTestTwo = quaternary.decimalToQuaternary(testIntTwo);
        int qTestThree = quaternary.decimalToQuaternary(testIntThree);
        int qTestFour = quaternary.decimalToQuaternary(testIntFour);
        Assertions.assertEquals(123, qTestOne);
        Assertions.assertEquals(1, qTestTwo);
        Assertions.assertEquals(31, qTestThree);
        Assertions.assertEquals(210,  qTestFour);
    }
}
