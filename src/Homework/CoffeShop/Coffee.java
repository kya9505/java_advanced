package Homework.CoffeShop;

public class Coffee extends Beverage {
       public static int amount;
       public Coffee(String name) {
           this.name = name;
           calcPrice(name);
       }

    @Override
    public void calcPrice(String name) {
        if(name.equals("Americano")){
            setName(name);
            setPrice(1500);
            amount++;
        }
        if(name.equals("Cappuccino")){
            setName(name);
            setPrice(3000);
            amount++;
        }
        if(name.equals("CafeLatte")){
            setName(name);
            setPrice(2500);
            amount++;
        }

    }
}