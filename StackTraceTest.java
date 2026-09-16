public class StackTraceTest {

    static void main(String[] args) {
        try{
            int res=10/0;
        }
         catch (ArithmeticException e){
            System.out.println("Message");
            System.out.println(e.getMessage());
             System.out.println("toString");
            System.out.println(e.toString());
             System.out.println("Stack Trace.");
            e.getStackTrace();
         }
    }
}
