class SecondLargest
{
public static  void  main(String args[])
{
int arr[]={25,18,20,31,14};
int largest=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]>largest) largest=arr[i];
}
System.out.println(largest);
}
}
