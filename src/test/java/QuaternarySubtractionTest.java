import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuaternarySubtractionTest {
    @Test
    void testQuaternarySubtraction() {
        Quaternary quaternary = new Quaternary();
        int qOneDifOne = 21;
        int qTwoDifOne = 3;
        int qOneDifTwo = 303;
        int qTwoDifTwo = 133;
        int qDifOne = quaternary.quaternarySubtraction(qOneDifOne, qTwoDifOne);
        int qDifTwo = quaternary.quaternarySubtraction(qOneDifTwo, qTwoDifTwo);
        Assertions.assertEquals(12, qDifOne);
        Assertions.assertEquals(110, qDifTwo);
    }
}
