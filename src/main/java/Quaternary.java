// :3 Built by Noah Oosterhoff \^-^/
public class Quaternary {

    /* This function works by making the quat a string, then adding all its parts together
       with the power in its position */
    public int quaternaryToDecimal(int quaternaryNum) {
        int decimalNum = 0;
        int currentNum;
        String quaternaryString = Integer.toString(quaternaryNum);
        for(int i = 0; i < quaternaryString.length(); i++) {
            currentNum = Character.getNumericValue(quaternaryString.charAt(i));
            decimalNum += currentNum * (Math.pow(4, quaternaryString.length() - i - 1));
        }
        return decimalNum;
    }

    /* This function works by find the highest power of 4 it can be subtracted by,
       then builds the rest out with a four loop that checks the biggest number you
       can have on that power level :)                                             */
    public int decimalToQuaternary(int decimalNum) {
        String quaternaryString = "";
        int decimalSub = decimalNum;
        int currentPower = 0;
        while(decimalSub - Math.pow(4, currentPower) >= 0) {
            currentPower++;
        }
        currentPower--;
        while(decimalSub > 0 || currentPower >= 0) { // currentPower check makes quats ending w/ 0 work
            for(int i = 3; i >= 0; i--) {
                if(decimalSub - i * Math.pow(4, currentPower) >= 0) {
                    quaternaryString += Integer.toString(i);
                    decimalSub -= i * Math.pow(4, currentPower);
                    break;
                }
            }
            currentPower--;
        }
        return Integer.parseInt(quaternaryString);
    }

    public int quaternaryAddition(int qNumOne, int qNumTwo) {
        int qIntOne = quaternaryToDecimal(qNumOne);
        int qIntTwo = quaternaryToDecimal(qNumTwo);
        int qIntSum = qIntOne + qIntTwo;
        return decimalToQuaternary(qIntSum);
    }

    // Number being subtracted from first, subtractor second
    public int quaternarySubtraction(int qNumOne, int qNumTwo) {
        int qIntOne = quaternaryToDecimal(qNumOne);
        int qIntTwo = quaternaryToDecimal(qNumTwo);
        System.out.println(qIntOne + "\n" + qIntTwo);
        int qIntDif = qIntOne - qIntTwo;
        return decimalToQuaternary(qIntDif);
    }

    public int quaternaryMultiplication(int qNumOne, int qNumTwo) {
        int qIntOne = quaternaryToDecimal(qNumOne);
        int qIntTwo = quaternaryToDecimal(qNumTwo);
        int qIntProd = qIntOne * qIntTwo;
        return decimalToQuaternary(qIntProd);
    }

    // Number being divided first, number dividing second
    public int quaternaryDivision(int qNumOne, int qNumTwo) {
        int qIntOne = quaternaryToDecimal(qNumOne);
        int qIntTwo = quaternaryToDecimal(qNumTwo);
        int qIntQuot = qIntOne / qIntTwo;
        return decimalToQuaternary(qIntQuot);
    }

    public int quaternarySquare(int qNum) {
        int qInt = quaternaryToDecimal(qNum);
        int qIntSquared = (int)Math.pow(qInt, 2);
        return decimalToQuaternary(qIntSquared);
    }

    public int quaternarySquareRoot(int qNum) {
        int qInt = quaternaryToDecimal(qNum);
        int qIntSquareRoot = (int)Math.round(Math.sqrt(qInt));
        return decimalToQuaternary(qIntSquareRoot);
    }
}
