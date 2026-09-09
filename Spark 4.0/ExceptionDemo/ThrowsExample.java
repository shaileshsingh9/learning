import java.io.IOException;

public class ThrowsExample {


    public static void readFile() throws IOException{
        System.out.println("File read krne ki koshish ...");
        throw new IOException("file nhi mili");
    }


    static void main(String[] args) {
        try{
            readFile();
        } catch (IOException e) {

            System.out.println("Exception handled");
            System.out.println(e.getMessage());
        }
        System.out.println("program continue..");

    }
}
