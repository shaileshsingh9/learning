class City{
     public void facilities(){
         System.out.println("Better lifestyle ");
     }
}
class Village extends City{

    @Override
    public void facilities(){
        System.out.println("Poor lifestyles..");
        super.facilities();
    }
}



public class PublicModifier {
    public static void main(String[] args) {
     Village village=new Village();
     village.facilities();
    }
}
