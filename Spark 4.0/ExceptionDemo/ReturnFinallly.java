public class ReturnFinallly {

    public static int test(){
        try {
            return 10;
        }
        finally{
            System.out.println("finally");
        }
    }

    static void main(String[] args) {
       int result = test();
       System.out.println("return value "+result);
    }
}
