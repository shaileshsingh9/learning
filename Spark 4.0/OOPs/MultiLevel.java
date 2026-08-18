class Cow{
    void eat(){
        System.out.println("Cow is eating..");
    }
}

class Cat extends Cow{
    void meow(){
        System.out.println("meow meow ");
    }
}

class puppy extends Cat{
    void play(){
        System.out.println("Puppy is playing...");
    }
}


public class MultiLevel {
    static void main(String[] args) {
        puppy p=new puppy();
        p.eat();
        p.meow();
        p.play();
    }
}
