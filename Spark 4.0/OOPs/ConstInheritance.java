class Employee{
    Employee(){
        System.out.println("Constructor..");
    }
}
class Developer extends Employee{
    Developer(){
        System.out.println("Developer...");
    }
}


public class ConstInheritance {
    static void main(String[] args) {
     Developer developer=new Developer();
    }
}
