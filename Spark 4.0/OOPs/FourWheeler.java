class Vehic{
    String color="White";
    Vehic(){

    }
}
class Carr extends Vehic{
  String color="Black";
  void display(){
      System.out.println(color);
      System.out.println(super.color);
  }
}



public class FourWheeler {
    public static void main(String[] args) {
        Carr carr=new Carr();
        carr.display();
    }
}
