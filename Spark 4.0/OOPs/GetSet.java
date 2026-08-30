public class GetSet {
//    String name;
   private int age;
    void setAge(int age){
        this.age=age;
    }
  int getAge(){
        return age;
    }

    static void main(String[] args) {
        GetSet gs=new GetSet();
        gs.setAge(23);
        System.out.println(gs.getAge());
    }

}
