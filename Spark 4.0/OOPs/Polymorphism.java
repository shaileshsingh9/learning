class Shapee{
    void draw(){
        System.out.println("Drawing shape.........");
    }
}
class Rectangle extends Shapee{
    @Override
    void draw(){
        System.out.println("Rectangle is draw.......");
    }
}
class Triangle extends Shapee{
    @Override
    void draw(){
        System.out.println("triangle draw...");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
      Shapee rectangle=new Rectangle();
      rectangle.draw();
      Shapee T=new Triangle();
      T.draw();
    }
}
