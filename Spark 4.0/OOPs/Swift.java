class Vehicle{
     String name;
    void run(){
        System.out.println("Running...");
    }

}
class Thar extends Vehicle{
   void drive(){
       System.out.println("Driving...");
   }
}

public class Swift {
    static void main(String[] args) {
Thar t=new Thar();
t.name="Mahindra";
t.drive();
t.run();
System.out.println(t.name);
    }
}
