public class StringBasics {

    public static void main(String[] args) {

        // 1. String Declaration and Initialization
        String name = "Shailesh";
        String language = "Java";

        System.out.println("Name: " + name);
        System.out.println("Language: " + language);


        // 2. String Literal
        String s1 = "Java";
        String s2 = "Java";

        System.out.println("s1 == s2: " + (s1 == s2));


        // 3. new String()
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("s3 == s4: " + (s3 == s4));
        System.out.println("s3.equals(s4): " + s3.equals(s4));


        // 4. String Immutability
        String message = "Hello";

        message.concat(" World");

        System.out.println("After concat without assignment: " + message);

        message = message.concat(" World");

        System.out.println("After concat with assignment: " + message);


        // 5. == vs equals()
        String a = "Java";
        String b = new String("Java");

        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a.equals(\"java\"): " + a.equals("java"));
        System.out.println("a.equalsIgnoreCase(\"java\"): " + a.equalsIgnoreCase("java"));


        // 6. length()
        String word = "Programming";

        System.out.println("Length: " + word.length());
        System.out.println("Last Index: " + (word.length() - 1));


        // 7. charAt()
        System.out.println("First Character: " + word.charAt(0));
        System.out.println("Fourth Character: " + word.charAt(3));
        System.out.println("Last Character: " + word.charAt(word.length() - 1));
    }
}