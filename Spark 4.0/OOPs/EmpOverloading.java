class Employees{

    Employees(){
        System.out.println("Employees is created...");
    }
    Employees(String name){
        System.out.println("Name "+name);

    }
    Employees(String name , double salary){
        System.out.println("Name "+name);
        System.out.println("Salary "+salary);

    }
}

public class EmpOverloading {
    public static void main(String[] args) {

        //overloading..
        Employees employees=new Employees();
        Employees employees1=new Employees("Awanish barnwal");
        Employees employees2=new Employees("Mukesh singh", 30000);
    }
}
