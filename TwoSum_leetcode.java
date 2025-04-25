public class TwoSum_leetcode {
        public static void main(String args[]){
            int num[]={1,2,3,4,5,6,7,8,9};
            int target=10;
            for(int i=0; i<=num.length; i++){
                for (int j=i+1; j<num.length; i++){
                    if (num[i] +num[j]== target){
                        System.out.println("Indices: [" + i + ", " + j + "]");
                        return ;
                    }
                }
            }
        }
    }
    

