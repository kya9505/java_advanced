package day5.BilderPattern.Ex3;

public class Hamburger {
    private String bun;
    private String patty;
    private String drink;
    //선택멤버
    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean bacon;


    private Hamburger(BurgerBilder burgerBilder) {
        this.bun = burgerBilder.bun;
        this.patty = burgerBilder.patty;
        this.drink = burgerBilder.drink;
        this.cheese = burgerBilder.cheese;
        this.lettuce = burgerBilder.lettuce;
        this.tomato = burgerBilder.tomato;
        this.bacon = burgerBilder.bacon;
    }

    public static class BurgerBilder {
        private String bun;
        private String patty;
        private String drink;

        //선택멤버
        private boolean cheese = false;
        private boolean tomato = false;
        private boolean lettuce = false;
        private boolean bacon;

        public BurgerBilder(String patty, String bun, String drink) {
            this.patty = patty;
            this.bun = bun;
            this.drink = drink;
        }

        public BurgerBilder addCheese() {
            this.cheese = true;
            return this;
        }public BurgerBilder addlettuce() {
            this.lettuce = true;
            return this;
        }public BurgerBilder addtomato() {
            this.tomato = true;
            return this;
        }
        public BurgerBilder addBacon(){
            this.bacon = true;
            return this;
        }
        public Hamburger build(){
            return  new Hamburger(this);
        }

    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", drink='" + drink + '\'' +
                ", cheese=" + cheese +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                '}';
    }
}
class HambugerMain{
    public static void main(String[] args) {
        Hamburger chikenSet = new Hamburger.BurgerBilder("닭고기패티","플랫","제로콜라").addCheese().addlettuce().addtomato().addBacon().build();
        System.out.println(chikenSet);
    }
}