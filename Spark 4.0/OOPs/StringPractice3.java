public class StringPractice3 {
    public static void main(String[] args) {

        String text = "java";
        String firstName = "  Shailesh  ";
        String lastName = "  Singh  ";
        String name="Java Full Stack Developer";

        text.toUpperCase();

        System.out.println(text);

        text = text.toUpperCase();

        System.out.println(text);



        firstName = firstName.strip();
        lastName = lastName.trim();

        String fullName = firstName.concat(" ").concat(lastName);

        System.out.println(fullName);

        // 8. substring()
        System.out.println(name.substring(5));
        System.out.println(name.substring(0, 4));

        // 9. contains()
        System.out.println(name.contains("Java"));
        System.out.println(name.contains("Full"));
        System.out.println(name.contains("Python"));



    }
}