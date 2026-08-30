class Bus{
    void big(){
        System.out.println("Bus is big");

    }
}
class Aeroplane extends Bus{
    void fly(){
        System.out.println("Flying   ");
    }
}
class BMW extends Aeroplane{
   void speed(){
       System.out.println("speed is fast..");
   }
}


public class Multi {
    static void main(String[] args) {
     BMW bmw=new BMW();
     bmw.speed();
     bmw.fly();
     bmw.big();
    }
}
