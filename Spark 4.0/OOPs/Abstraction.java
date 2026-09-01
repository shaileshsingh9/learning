abstract class Company{
    abstract void employees();
    void salary(){
        System.out.println("company gives salary....");
    }
}
class Manager extends Company{
    @Override
    void employees(){
        System.out.println("Manager salary is coming..");
    }
}
class Hr extends Company{
    @Override
    void employees(){
        System.out.println("HR salary is coming.." );
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.employees();
        manager.salary();

        Hr h=new Hr();
        h.employees();
        h.salary();

    }
}
