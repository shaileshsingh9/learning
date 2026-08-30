class House{
    void big(){
        System.out.println("House is big ");
    }
}
class Room extends House{

    @Override
    void big(){
        System.out.println("Room is big... ");
        super.big();
    }
}

public class Over {
   public static void main(String[] args) {
     Room room=new Room();
     room.big();
    }
}
