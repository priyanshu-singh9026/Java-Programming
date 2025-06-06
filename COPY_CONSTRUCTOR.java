public class COPY_CONSTRUCTOR {
    public static void main(String args[]){
    student s1= new student();
    s1.name="priyanshu";
    s1.age=23;
    s1.marks[0]=93;
    s1.marks[1]=42;
    s1.marks[2]=24;
    s1.password="shr";
    student s2=  new student(s1);
    s2.password="priy";
    s2.age=44;
    System.out.println(s2.password);
    s1.marks[2]=31;
    for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
    }
    }
}
class student{
    String name;
    int age;
    String password;
    int marks[]=new int[3];
    //copy constructor
    student (student s1){
         marks=new int[3];
        this.name=s1.name;
        this.age=s1.age;
        this.marks=s1.marks;
    }
    student(){
        System.out.println();
    }

}
