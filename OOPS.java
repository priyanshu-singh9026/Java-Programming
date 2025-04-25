public class OOPS {
    public static void main(String args[]){
        Pen p1= new Pen();//clreted a pen object called p1
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(1);
        System.out.println(p1.tip);
        student p2=new student();
        p2.setname("priyanshu");
        System.out.println(p2.name);
    }
    
}
class Pen{
    String color;
    int tip;
    void setcolor(String newcolor){
     color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}
class student{
    String name;
    int age;
    float cgpa;
    void setname(String newname){
        name=newname;
    }
}