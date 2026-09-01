abstract class Library{
    String name="Lakshay ";
    final int chair= 10;
    static String type="Students";

      abstract void study();

      void display(){
          System.out.println("name of library : " +name);
          System.out.println("Number of chair : " +chair);
          System.out.println("Type : " +type);
      }

}
class Rooms extends Library{

    @Override
    void study(){
        System.out.println("All the Children are going to the library to study");
    }
}

public class AbstractPractice {
    public static void main(String[] args) {
      Rooms rooms=new Rooms();
      rooms.study();
      rooms.display();
    }
}
