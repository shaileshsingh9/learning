public class FinallyException {
    static void main(String[] args) {
        try{
            int a = 10/0;
            System.out.println("try executed ");
        }
        catch(ArithmeticException e){
            System.out.println("catch");

        }
        // exception aaye ya na aaye finally hmesa execute hoga....
        finally{
            System.out.println("finally");
        }
    }
}
