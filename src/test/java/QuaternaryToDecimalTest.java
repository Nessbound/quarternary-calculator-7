import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuaternaryToDecimalTest {
    @Test
    void testQuanternaryToDecimal() {
        Quaternary quaternary = new Quaternary();
        int testQOne = 302;
        int testQTwo = 2;
        int testQThree = -23;
        int testQFour = 0;
        int intTestOne = quaternary.quaternaryToDecimal(testQOne);
        int intTestTwo = quaternary.quaternaryToDecimal(testQTwo);
        int intTestThree = quaternary.quaternaryToDecimal(testQThree);
        int intTestFour = quaternary.quaternaryToDecimal((testQFour));
        Assertions.assertEquals(50, intTestOne);
        Assertions.assertEquals(2, intTestTwo);
        Assertions.assertEquals(-11, intTestThree);
        Assertions.assertEquals(0, intTestFour);
    }
}
