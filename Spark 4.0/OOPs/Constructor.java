public class Constructor {
    private String name;
    private int age;
    private String city;

    Constructor(String name, int age, String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }

    void setName(String name){
        this.name=name;

    }
    String getName(){
        return name;
    }
    void setAge(int age){
        this.age=age;
    }
    int getAge(){
        return age;

    }
    void setCity(String city){
        this.city=city;
    }
    String getCity(){
        return city;
    }


    static void main(String[] args) {
        Constructor c=new Constructor("Shailesh", 25, "Lucknow");
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getCity());
    }


}
