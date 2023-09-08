import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuaternaryDivisionTest {
    @Test
    void testQuaternaryDivision() {
        Quaternary quaternary = new Quaternary();
        int qOneQuotOne = 210;
        int qTwoQuotOne = 3;
        int qOneQuotTwo = 312;
        int qTwoQuotTwo = 12;
        int qOneQuotThree = 23;
        int qTwoQuotThree = 2;
        int qOneQuotFour = 10;
        int qTwoQuotFour = -2;
        int qQuotOne = quaternary.quaternaryDivision(qOneQuotOne, qTwoQuotOne);
        int qQuotTwo = quaternary.quaternaryDivision(qOneQuotTwo, qTwoQuotTwo);
        int qQuotThree = quaternary.quaternaryDivision(qOneQuotThree, qTwoQuotThree);
        int qQuotFour = quaternary.quaternaryDivision(qOneQuotFour, qTwoQuotFour); // Tests negatives
        Assertions.assertEquals(30, qQuotOne);
        Assertions.assertEquals(21, qQuotTwo);
        Assertions.assertEquals(11, qQuotThree);
        Assertions.assertEquals(-2, qQuotFour);
    }
}
