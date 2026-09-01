abstract class Cars{
    abstract void start();
    void stop(){
        System.out.println("Car is stop...");
    }
}
class Audi extends Cars{
    @Override
    void start(){
        System.out.println("Audi is started...");
    }
}
class Alto extends Cars{
    @Override
    void start(){
        System.out.println("Alto is started..");
    }
}


public class AbstractionPractice {
    public static void main(String[] args) {
        Cars cars=new Alto();
        cars.start();
        cars.stop();

        Cars cars1=new Audi();
        cars1.start();
        cars1.stop();
    }
}
