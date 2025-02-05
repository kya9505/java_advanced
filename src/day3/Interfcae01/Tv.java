package day3.Interfcae01;

public class Tv implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("TV전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV전원을 켭니다.");
    }
}
