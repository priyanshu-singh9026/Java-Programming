public class PositiveNegativeArray {
    public static void PNarray(int num[]) {
        int posIndex = 0, negIndex = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                posIndex = i;
                break;
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                negIndex = i;
                break;
            }
        }

        // Print numbers in alternating order
        for (int i = 0; posIndex < num.length || negIndex < num.length; i++) {
            if (i % 2 == 0) { 
                while (posIndex < num.length && num[posIndex] < 0) {
                    posIndex++;
                }
                if (posIndex < num.length) {
                    System.out.print(num[posIndex] + " ");
                    posIndex++;
                }
            } else { 
                while (negIndex < num.length && num[negIndex] > 0) {
                    negIndex++; 
                }
                if (negIndex < num.length) {
                    System.out.print(num[negIndex] + " ");
                    negIndex++;
                }
            }
        }
    }

    public static void main(String args[]) {
        int num[] = {1, -1, -2, -3, 1, -4, 6, 5, -6, 7, -8, 9};
        PNarray(num);
    }
}