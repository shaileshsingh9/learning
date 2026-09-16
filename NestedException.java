public class NestedException {
    static void main(String[] args) {
        try {
            System.out.println("Outer try");
            try{
                int i=10/0;
            }catch(ArithmeticException e){
                System.out.println("Inner catch..");

            }
        } catch (Exception e) {
            System.out.println("outer catch");
        }
    }
}
