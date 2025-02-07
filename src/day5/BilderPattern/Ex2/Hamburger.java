package day5.BilderPattern.Ex2;

public class Hamburger {
    private int bun;
    private int patty;
    private int cheese;
    private int lettuce;
    private int tomato;

    public Hamburger(){}

    public void setBun(int bun) {
        this.bun = bun;
    }

    public void setPatty(int patty) {
        this.patty = patty;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }
}

class HambugerMain{
    public static void main(String[] args) {

        Hamburger myhambuger = new Hamburger();
        myhambuger.setBun(2);
        myhambuger.setLettuce(2);
        myhambuger.setTomato(1);
        myhambuger.setPatty(1);
    }
}