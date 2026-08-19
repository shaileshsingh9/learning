public class Validation {
   private int age;
    void setAge(int age){
        if (age>0){
            this.age=age;
        }else{
            System.out.println("Invalid Age");
        }
    }
    int getAge(){
        return age;
    }

    static void main(String[] args) {
        Validation v=new Validation();
        v.setAge(7);
        System.out.println(v.getAge());
        v.setAge(-11);
        System.out.println(v.getAge());

    }

}
