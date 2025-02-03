package Homework.CoffeShop;

public class Tea extends Beverage {
    public static int amount;

    public Tea(String name){
        this.name = name;
        calcPrice(name);
    }
    @Override
    public void calcPrice(String name) {
        if(name.equals("lemonTea")){
            setName(name);
            setPrice(1500);
            amount++;
        }
        if(name.equals("ginsengTea")){
            setName(name);
            setPrice(2000);
            amount++;
        }
        if(name.equals("redginsengTea")){
            setName(name);
            setPrice(2500);
            amount++;
            }
    }
}