public class decimalTobinary {
    
    public static void decToBin(int n) {
        int pow = 0;
        int binNum = 0;
        int originalNum = n;

        while (n > 0) {
            int rem = n % 2; 
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2; 
        }
        System.out.println("Binary form of " + originalNum + " = " + binNum);
    }

    public static void main(String[] args) {
        decToBin(7); 
    }
}

