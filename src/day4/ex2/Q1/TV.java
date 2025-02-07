package day4.ex2.Q1;

public class TV implements Remocon{

    @Override
    public void powerOn() {
        System.out.println("TV를 켭니다.");
    }

    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }
}
