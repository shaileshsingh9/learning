class Students{

    Students(){
        System.out.println("Constructor created...");

    }
    Students(String name){
        System.out.println("Name = "+name);
    }
    Students(String name, int age){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}


public class ConsOverloading {
    public static void main(String[] args) {
      Students students=new Students();
      Students students1=new Students("shailesh singh");
      Students students2=new Students("Munjesh singh", 25);
    }
}
