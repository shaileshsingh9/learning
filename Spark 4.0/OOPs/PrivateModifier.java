class Father{
    private String name="shailesh singh";
     public String getName(){
           return name;    // access krne ke liye
     }

}
class Son extends Father{
    void display(){
        System.out.println(getName());
    }
}


public class PrivateModifier {
    public static void main(String[] args) {
       Son son=new Son();
       son.display();
    }
}
