package day3.Interfcae01;

public class RmoteMain {
    public static void main(String[] args) {
        RemoteControl remoteControl;
        remoteControl = new Tv();
        remoteControl.turnOn();
        remoteControl = new Radio();
        remoteControl.turnOn();
        System.out.println("최대볼륨 : "+RemoteControl.MAX_VOLUME);
        System.out.println("최대볼륨 : "+RemoteControl.MIN_VOLUME);
    }
}
