package day1.Homework.CoffeShop;

public class Coffee extends Beverage {
       public static int amount;

       public Coffee(String name) {
           super(name);
           calcPrice();
           amount++;
       }

    @Override
    public void calcPrice() {
        if(getName().equals("Americano")){
            setPrice(1500);
         }
        if(getName().equals("Cappuccino")){
            setPrice(3000);
         }
        if(getName().equals("CafeLatte")){
            setPrice(2500);
         }

    }
}