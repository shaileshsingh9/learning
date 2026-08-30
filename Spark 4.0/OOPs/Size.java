class Shape{

    void draw(){
        System.out.println("Drawing shape....");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Circle...");
    }
}



public class Size {
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.draw();

    }
}
