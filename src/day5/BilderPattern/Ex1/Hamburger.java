package day5.BilderPattern.Ex1;

public class Hamburger {
    int bun;
    int patty;
    int cheese;
    int lettuce;
    int tomato;


    public Hamburger(int bun, int patty, int cheese, int lettuce, int tomato) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
    }
}

class HambugerMain{
    public static void main(String[] args) {
        Hamburger myhambuger = new Hamburger(2,1,1,0,1);
    }
}