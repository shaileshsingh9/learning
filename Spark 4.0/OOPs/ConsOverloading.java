class Students {

    String name;
    int age;

    Students() {
    }

    Students(String name) {
        this.name = name;
    }

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ConsOverloading {

    public static void main(String[] args) {

        Students students = new Students();

        Students students1 = new Students("Shailesh Singh");

        Students students2 = new Students("Munjesh Singh", 25);
    }
}