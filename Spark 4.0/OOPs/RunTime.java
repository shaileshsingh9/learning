class Animals{

    void sound(){
        System.out.println("Animal makes sound..");
    }
}
class Dogs extends Animals{
    @Override
    void sound(){
        System.out.println("Dogs is braks bhowww.. bhowww..");
    }
}
class Cats extends Animals{
    @Override
    void sound(){
        System.out.println("Cats make sound meow meow.....");
    }
}
public class RunTime {
    public static void main(String[] args) {
        //overriding..
       Animals animals;

       animals=new Dogs();
       animals.sound();
       animals=new Cats();
       animals.sound();
    }
}


//Dog d = (Dog) a;