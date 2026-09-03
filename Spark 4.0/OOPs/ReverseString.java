public class ReverseString {
    static void main(String[] args) {
        String s="Shailesh";

        for(int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i));
        }

        System.out.println();


        //reverse string...

        for(int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
