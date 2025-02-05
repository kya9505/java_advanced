package day3.Animal;

public class Cat extends Tail implements Animal,Pet{

    public Cat(int tail) {
        this.tail = tail;
    }

    @Override
    public void cry() {
        System.out.println("야옹야옹");
    }

    @Override
    public void play() {
        System.out.println("캣타워를 올라간다!");
    }
}
