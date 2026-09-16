class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class CustomExceptionTest {

    static void checkAge(int age){
        if (age<18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("You are eligible");
    }

    public static void main(String[] args) {
        try{
            checkAge(16);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }
}
