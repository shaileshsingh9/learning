class Student{
String name;
int age;
String course;

void displayDetails(){
 System.out.println(name);
 System.out.println(age);
 System.out.println(course);
}

}

public class r1{

public static void main(String[] args){
  Student s1=new Student();
  Student s2=new Student();
  Student s3=new Student();

  s1.name=("Shailesh singh");
  s2.name=("Munjesh Singh");
  s1.age=(21);
  s2.age=(24);
  s1.course=("Java developer");
  s2.course=("Safety engineer");
  s1.displayDetails();
  s2.displayDetails();

   s3.name=("Mukesh singh");
   s3.age=(23);
   s3.course=("Agentic AI");
s3.displayDetails();

}

}