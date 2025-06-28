public class Search_from_2dMatrix {
    public static  boolean search(int [][] matrix,int target){
        int row=0;
        int column=matrix[0].length-1;
        while(row<matrix.length && column>=0){
            if(matrix[row][column]==target){
                return true;
            }else if(matrix[row][column]>target){
    column--;
            }else{
   row++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=99;
        System.out.println(search(matrix, target));
    }
    
}
