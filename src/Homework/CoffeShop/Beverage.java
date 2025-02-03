package Homework.CoffeShop;

abstract public class Beverage {
    String name;
    int price;
    static int TotalPrice;
    String SalesInfo;

    public Beverage(){}

    public static void getSalesInfo(Beverage[] beverage) {
        for(int i = 0 ; i<beverage.length; i++){
            System.out.println(i + "번째 판매 음료는 "+ beverage[i].name+"이며,"+"가격은 "+ beverage[i].price);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public abstract void calcPrice(String name);

    public static int getTotalPrice(Beverage beverage[]){
        for (int i = 0; i < beverage.length; i++) {
            TotalPrice += beverage[i].price;
        }
        return TotalPrice;
        }
}
