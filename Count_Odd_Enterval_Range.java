public class Count_Odd_Enterval_Range {
     public static int countOdds(int low, int high) {
        return (high + 1) / 2 - (low / 2);
    }
    public static void main(String[] args) {
        int res=countOdds(3, 7);
        System.out.println(res);
    }
}


