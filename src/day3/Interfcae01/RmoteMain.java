package day3.Interfcae01;

public class RmoteMain {
    public static void main(String[] args) {
        RemoteControl remoteControl;
        remoteControl = new Tv();
        remoteControl.turnOn();
        remoteControl.setVolume(10);
        remoteControl.turnOff();

        System.out.println();
        remoteControl = new Radio();
        remoteControl.turnOn();
        remoteControl.setVolume(20);
        remoteControl.turnOff();;

        RemoteControl.changeBattery();
    }
}
