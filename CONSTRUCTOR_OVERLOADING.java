public class CONSTRUCTOR_OVERLOADING {
    public static void main(String args[]){
        student s1=new student();
        student s2= new student("priyanshu");
       student  s3=  new student (23);
    }
}
class student{
    String name;
    int age;
    student(){
    System.out.println("constructor is called....");
    }
   student (String name){
    this.name=name;
    System.out.println(name);
   }
   student(int age){
    this.age=age;
   System.out.println(age);
   }
}
