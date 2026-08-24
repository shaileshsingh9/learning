
// Aggregation topic

class Enginee{
    void Start(){
        System.out.println("Engine is ready to started ");
    }

}
public class Train {
    Enginee enginee;
    Train(Enginee enginee){
        this.enginee=enginee;
    }
    void drive(){
        enginee.Start();
        System.out.println("Train is ready to run..");
    }
    static void main(String[] args) {
       Enginee enginee1=new Enginee();
       Train t=new Train(enginee1);
       t.drive();
    }
}
