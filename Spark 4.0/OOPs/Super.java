class Person{
    String name;
    Person(String name){
      this.name=name;
    }
}
class Student extends Person{
    Student(String name){
       super(name);
    }

    void display(){
         System.out.println(name);
    }
}


public class Super {
    public static void main(String[] args) {
      Student s=new Student("Abhay");
      s.display();
    }
}
