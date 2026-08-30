class Calculator{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void add(double a , double b){
        System.out.println(a+b);

    }
}
public class OverLoading {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.add(10,30);
        calculator.add(5,10,5);
        calculator.add(14.5,5.5);
    }
}
