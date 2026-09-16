public class PropagationTest {

    static void m1(){
        int i = 10/0;
    }
    static void m2(){
        m1();
    }
    static void m3(){
        m2();
    }

    static void main(String[] args) {
        try {
            m3();
        }
        catch (ArithmeticException e){
            System.out.println("Exception handled ");
        }

    }
}
