interface FoodOrder{
    void placeOrder();
}
class PizzaOrder implements FoodOrder{
    @Override
    public void placeOrder(){
        System.out.println("Pizza order is placed.");
    }
}
class BurgerOrder implements FoodOrder{
    @Override
    public void placeOrder(){
        System.out.println("Burger order is placed..");
    }
}
class BriyaniOrder implements FoodOrder{
    @Override
    public void placeOrder(){
        System.out.println("Briyani order is placed...");
    }
}
public class PracticeInterface {
    public static void main(String[] args) {

        FoodOrder foodOrder1=new PizzaOrder();
        FoodOrder foodOrder2=new BurgerOrder();
        FoodOrder foodOrder3=new BriyaniOrder();

        foodOrder1.placeOrder();
        foodOrder2.placeOrder();
        foodOrder3.placeOrder();
    }
}
