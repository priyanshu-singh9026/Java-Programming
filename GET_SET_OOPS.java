public class GET_SET_OOPS {
public static void main(String args[]){
pen p1= new pen();
p1.setcolor("blue");
System.out.println(p1.getcolor());
p1.settip(1);
System.out.println(p1.gettip());
}
    
}
class pen{
    private String color;
    int tip;
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }}
