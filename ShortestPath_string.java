import java.util.*;
public class ShortestPath_string {
public static float Shortestpath(String path){
    int y=0,x=0;
    for(int i=0; i<path.length(); i++){
        char dir=path.charAt(i);
        if(dir=='s'){
            y--;
        }
        if(dir=='n'){
            y++;
        }
        if(dir=='w'){
            x--;
        }
       else{
            x++;
        }
    }
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2+y2);
}
public static void main(String args[]){
    String path="wneenesennn";
    System.out.println(Shortestpath(path));

}
    
}
