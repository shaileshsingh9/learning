public class ThrowExample {


    static void main(String[] args) {
        int age=16;
        try{
            if(age < 18){
             throw new RuntimeException("Age must be 18 or above..");
            }
            System.out.println("You are eligible..");
        }
        catch(RuntimeException e ){
            System.out.println("Exception handled,,");
            System.out.println(e.getMessage());

        }
        System.out.println("Program continue..");

    }
}
