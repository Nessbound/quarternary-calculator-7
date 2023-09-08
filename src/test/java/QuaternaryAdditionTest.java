import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuaternaryAdditionTest {
    @Test
    void testQuaternaryAddition() {
        Quaternary quaternary = new Quaternary();
        int qOneSumOne = 31;
        int qTwoSumOne = 2;
        int qOneSumTwo = 213;
        int qTwoSumTwo = 12;
        int qOneSumThree = -2;
        int qTwoSumThree = 132;
        int qSumOne = quaternary.quaternaryAddition(qOneSumOne, qTwoSumOne);
        int qSumTwo = quaternary.quaternaryAddition(qOneSumTwo, qTwoSumTwo);
        int qSumThree = quaternary.quaternaryAddition(qOneSumThree, qTwoSumThree); // Tests negatives
        Assertions.assertEquals(33, qSumOne);
        Assertions.assertEquals(231, qSumTwo);
        Assertions.assertEquals(130, qSumThree);
    }
}
