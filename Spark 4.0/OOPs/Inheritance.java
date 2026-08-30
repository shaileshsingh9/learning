class Car{
    String name;
     void wheel(){
         System.out.println("rolling....");
     }
}
class Break extends Car{
 void stop(){
     System.out.println("Car is stop");
 }
}





public class Inheritance {
    static void main(String[] args) {
     Car c=new Car();
     c.name="Xuv";

     Break b=new Break();
     b.wheel();
     b.stop();
     System.out.println(c.name);
    }
}
