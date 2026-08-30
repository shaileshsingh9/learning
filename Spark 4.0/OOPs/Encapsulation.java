public class Encapsulation {
    String name;
   private int age;

    void display(){
        System.out.println(name);
        System.out.println(age);

    }

    static void main(String[] args) {
        Encapsulation en=new Encapsulation();
        en.name="singh";
         en.age=22;
          en.display();
//        en.age=-10;
//        en.display();

    }
}
