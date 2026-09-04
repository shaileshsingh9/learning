import java.util.*;
class Students{
String name;
int age;
String course;

void show(){
System.out.println("Name : "+name);
System.out.println("Age : "+age);
System.out.println("Course : "+course);
}
}


public class r2{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Students s1=new Students();
    
    System.out.println("Enter name : ");
    s1.name=sc.nextLine();
    System.out.println("Enter age : ");
    s1.age=sc.nextInt();
     
      sc.nextLine();

    System.out.println("Enter course : ");
    s1.course=sc.nextLine();
    
   s1.show();
   sc.close();

}

}