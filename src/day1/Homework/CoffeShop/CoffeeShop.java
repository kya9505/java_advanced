package day1.Homework.CoffeShop;

public class CoffeeShop {
    public static void main(String[] args) {
        System.out.println("****java nara CoffeeShop영업개시****");
        Beverage[] beverage = new Beverage[5];
        beverage[0] = new Coffee("Cappuccino");
        beverage[1] = new Coffee("CafeLatte");
        beverage[2] = new Tea("ginsengTea");
        beverage[3] = new Coffee("CafeLatte");
        beverage[4] = new Tea("redginsengTea");

       Beverage.getSalesInfo(beverage);
        System.out.println("총 판매 금액==>" +Beverage.getTotalPrice(beverage));
        System.out.println("Coffe의 판매 개수=>" + Coffee.amount + "잔");
        System.out.println("Tea의 판매 개수=>" + Tea.amount + "잔");
    }
}
