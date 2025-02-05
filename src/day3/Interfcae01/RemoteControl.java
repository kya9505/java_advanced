package day3.Interfcae01;

public interface RemoteControl {
    public void turnOn();
    public void turnOff();

    public static final int MAX_VOLUME = 30;
    public static final int MIN_VOLUME = 0;

    public void setVolume(int volume);
}
