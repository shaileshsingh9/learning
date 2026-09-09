public class GetMessageTest {
    static void main(String[] args) {
        try{
            int result= 10/0;
            System.out.println("hello");

        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Exception handled  ");

        }
    }
}
