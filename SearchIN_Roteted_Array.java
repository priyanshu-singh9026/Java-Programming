public class SearchIN_Roteted_Array {
    public static int  Search(int num[], int tar,int si, int ei){
      if(si>ei){
        return -1;
      }


        //kaam
        int mid=(si+ei)/2;

        //case FOUND
        if(num[mid]==tar){
            return mid;
        }

        //mid on l1
        if(num[si]<=num[mid]){
            //case left
            if(num[si] <= tar && tar <=num[mid]){
                return Search(num, tar, si, mid-1);
            }else{
                return Search(num, tar, mid+1, ei);
            }

        }
        //mid on l2
        if(num[mid] <=tar && tar <= num[ei]){
              return Search(num, tar, si, mid-1);
        }else{
            return Search(num, tar, si, mid-1);
        }
    }
    public static void main(String[] args) {
        
        int num[]={4,5,6,7,0,1,2};
        int tar= 0;
        int tarIdx=Search(num, tar, 0, num.length-1);
        System.out.println(tarIdx);
    }
    
}
