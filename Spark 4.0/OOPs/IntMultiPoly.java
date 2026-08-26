interface Transport{
    void move();
}
class Cycle implements Transport{
    @Override
    public void move(){
        System.out.println("Cycle is running....");
    }
}
class Scooty implements Transport {
    @Override
    public void move() {
        System.out.println("Scooty is running.....");
    }
}
class Ola implements Transport{
    @Override
    public void move(){
        System.out.println("Ola is running now...");
    }
}

public class IntMultiPoly {

//    static void MovingVehicle(Transport transport){
//        transport.move();
//
//    }

    public static void main(String[] args) {

//        MovingVehicle(new Cycle());
//        MovingVehicle(new Ola());
//        MovingVehicle(new Scooty());

        Transport transport;

        transport=new Scooty();
        transport.move();

        transport=new Ola();
        transport.move();

        transport=new Cycle();
        transport.move();

    }
}
