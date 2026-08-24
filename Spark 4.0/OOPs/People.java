interface Human{
    String TYPE= "People";
    void sound();
    void eat();

        }
 class Boy implements Human{

    @Override
    public void sound(){
        System.out.println("Boy is speaking...  hello dosto");
    }
    @Override
     public void eat(){
        System.out.println("Boy is eating.. foods");
    }
 }
 class Girls implements Human{
     @Override
    public void sound(){
        System.out.println("Girls is speaking...  hey friends.");
    }
     @Override
     public void eat(){
        System.out.println("Girls is eating... Momes Momes..");
     }
 }
public class People {
   public  static void main(String[] args) {

       Boy b=new Boy();
       b.eat();
       b.sound();
       System.out.println(Human.TYPE);


       Girls g=new Girls();
       g.eat();
       g.sound();


       // refernce interface
       Human human=new Boy();
       Human human1=new Girls();

       human.sound();
       human1.sound();
    }
}
