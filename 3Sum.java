public class 3Sum {
    public static boolean 3sum(int nums[]){
        ArrayList <Integer> ll= new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum= nums[i]+nums[j]nums[k];
                    if(sum==0){
                     ll.add(nums[i], nums[j],nums[k]);
                     i++;
                     return true;
                    }
                }
            }
            return false;
        }
    }
    public static void main(Stirng args[]){
        int nums[]={-1,0,1,2,-1,-4};
        3sum(nums);
    }
    
}
