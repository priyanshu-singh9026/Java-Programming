public class BinaryToDecimal {
    public static int BinToDec(int binNum) {
        int pow = 0;
        int Decnum = 0;
        int originalBinNum = binNum; 

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            Decnum = Decnum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal number is " + originalBinNum + " = " + Decnum);
        return Decnum; 
    }

    public static void main(String[] args) {
        BinToDec(110); 
    }
}

