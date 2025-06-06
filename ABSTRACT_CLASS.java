public class ABSTRACT_CLASS {
    public static void main(String args[]){
        horse h = new horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
       // chicken c =new chicken();
        //c.eat();
        //c.walk();
        //System.out.println(c.color);
    }
}
abstract class animal{
    String color;;
    animal(){
        color="brown";
    }
    void eat(){
    System.out.println("animal eat");
    }
    abstract void walk();
}
class horse extends animal{
    void changecolor(){
        color= "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs:");
    }
}
    class chicken extends animal{
        void changecolor(){
            color= "yellow";
        }
   void walk(){
    System.out.println("walks on two legs:");
   }
    
}
