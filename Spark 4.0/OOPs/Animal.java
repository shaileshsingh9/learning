public class Animal {
    void eat(){
        System.out.println("Animal is eating.... ");
    }
    void sound(){
        System.out.println("making sound treeee treeee");
    }

}
class Dog extends Animal
{
    @Override
    void sound() {
        System.out.println("dog is bark...");
    }
}