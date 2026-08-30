// Composition topic in inheritance

class Engine{
    void start(){
        System.out.println("Engine is started..");
    }
}

public class Bike {
    Engine engine;
    Bike(){

        engine =new Engine();

    }
    void drive(){
       engine.start();
        System.out.println("Bike is running ");
    }
   public static void main(String[] args) {
      Bike c=new Bike();
      c.drive();
    }
}
