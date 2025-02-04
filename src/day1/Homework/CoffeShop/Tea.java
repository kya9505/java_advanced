package day1.Homework.CoffeShop;

public class Tea extends Beverage {
    public static int amount;

    public Tea(String name){
        super.setName(name);
        calcPrice();
        amount++;
    }
    @Override
    public void calcPrice() {
        if(getName().equals("lemonTea")){
            setPrice(1500);

        }
        if(getName().equals("ginsengTea")){
            setPrice(2000);
        }
        if(getName().equals("redginsengTea")){
            setPrice(2500);
            }
    }
}