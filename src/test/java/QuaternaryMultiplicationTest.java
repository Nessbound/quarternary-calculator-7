import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuaternaryMultiplicationTest {
    @Test
    void testQuaternaryMultiplication() {
        Quaternary quaternary = new Quaternary();
        int qOneProdOne = 30;
        int qTwoProdOne = 11;
        int qOneProdTwo = 333;
        int qTwoProdTwo = 201;
        int qProdOne = quaternary.quaternaryMultiplication(qOneProdOne, qTwoProdOne);
        int qProdTwo = quaternary.quaternaryMultiplication(qOneProdTwo, qTwoProdTwo);
        Assertions.assertEquals(330, qProdOne);
        Assertions.assertEquals(200133, qProdTwo);
    }
}
