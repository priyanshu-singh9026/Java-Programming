 //Write a Java program to find the length of a string.
public class StringReverse {
    public static void reverse(char str[]){
   int n=0, y=str.length-1;
   while(n<y){
    char temp=str[n];
    str[n]=str[y];
    str[y]=temp;
    n++;
    y--;
   }
   
}
public static void main(String args[]){
    String s="priyanshu";
    char str[]=s.toCharArray();
    reverse(str);
    System.out.println(new String(str));

}
    
}
